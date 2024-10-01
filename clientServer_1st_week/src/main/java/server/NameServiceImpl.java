package server;

import exception.InvalidValueException;
import io.grpc.Status;
import io.grpc.StatusRuntimeException;
import io.grpc.stub.StreamObserver;
import org.example.*;

import java.sql.*;

public class NameServiceImpl extends NameServiceGrpc.NameServiceImplBase {

    private static String jdbc_url="jdbc:mysql://localhost:3306/mysql";
    private static String user="----";
    private static String password="--------";

    private Connection connection=null;
    private PreparedStatement statement=null;
    //인젝션 공격 가능성을 고려해 prepared statement를 사용

    @Override
    public void saveName(SaveRequest request, StreamObserver<SaveResponse> responseObserver) {
//        super.saveName(request, responseObserver);
        //request와 response 설정하고 통신

        String name=request.getName();

        try{
            if (request.getName().isEmpty()) {
                //비어있을 때
                throw new InvalidValueException("이름이 비어있습니다.",400);
            }
            if(name.matches(".*[0-9].*")){
                //숫자가 있을 때
                throw new InvalidValueException("이름에 숫자가 포함되어 있습니다.",401);
            }
            if(name.contains(" ")){
                //공백 문자가 있을 때
                throw new InvalidValueException("이름에 공백문자가 있습니다.",402);
            }

            connection= DriverManager.getConnection(jdbc_url,user,password);
            String insertName="INSERT INTO name (name) VALUES (?)";

            //prepared statement로 데이터 설정
            statement=connection.prepareStatement(insertName);
            statement.setString(1,name);

            //쿼리 실행
            int insert=statement.executeUpdate();
            if(insert>0){
                System.out.println("이름 저장 성공");
                SaveResponse saveResponse=SaveResponse.newBuilder()
                        .setResponse("저장에 성공했습니다.")
                        .build();
                responseObserver.onNext(saveResponse);
                responseObserver.onCompleted();
            }
        } catch (InvalidValueException e){
            StatusRuntimeException statusException= Status.INVALID_ARGUMENT
                    .withDescription(e.getMessage())
                    .augmentDescription("Error Code: "+e.getStatusCode())
                    .asRuntimeException();
            responseObserver.onError(statusException);
        } catch (SQLException e) {
            StatusRuntimeException statusException = Status.INTERNAL
                    .withDescription("Database error: " + e.getMessage())
                    .asRuntimeException();
            responseObserver.onError(statusException);
        }finally {
            //사용한 리소스들은 정리할 것
            try{
                if(statement!=null)statement.close();
                if(connection!=null)connection.close();
            }catch (SQLException e){
                e.printStackTrace();
            }
        }
    }

    @Override
    public void loadName(LoadRequest request, StreamObserver<LoadResponse> responseObserver) {
//        super.loadName(request, responseObserver);
        try{
            connection= DriverManager.getConnection(jdbc_url,user,password);
            String selectName="SELECT name from name where id=?";

            //prepared statement로 데이터 설정
            statement=connection.prepareStatement(selectName);
            statement.setInt(1,request.getRequest());

            //쿼리 실행
            ResultSet result=statement.executeQuery();
            if(result.next()){
                String name=result.getString("name");
                LoadResponse loadResponse=LoadResponse.newBuilder()
                        .setName(name)
                        .build();
                responseObserver.onNext(loadResponse);
                responseObserver.onCompleted();
            }else if (!result.next()) {
                //비어있을 때
                throw new InvalidValueException("ID가 존재하지 않습니다.",401);
            }
        } catch (InvalidValueException e) {
            StatusRuntimeException statusException= Status.INVALID_ARGUMENT
                    .withDescription(e.getMessage())
                    .augmentDescription("Error Code: "+e.getStatusCode())
                    .asRuntimeException();
            responseObserver.onError(statusException);
        } catch (SQLException e) {
            StatusRuntimeException statusException = Status.INTERNAL
                    .withDescription("Database error: " + e.getMessage())
                    .asRuntimeException();
            responseObserver.onError(statusException);
        }finally {
            //사용한 리소스들은 정리할 것
            try{
                if(statement!=null)statement.close();
                if(connection!=null)connection.close();
            }catch (SQLException e){
                e.printStackTrace();
            }
        }
    }
}