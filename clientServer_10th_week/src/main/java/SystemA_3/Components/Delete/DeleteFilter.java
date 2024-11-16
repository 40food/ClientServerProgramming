package SystemA_3.Components.Delete;

import SystemA_3.Framework.CommonFilterImpl;

import java.io.IOException;

public class DeleteFilter extends CommonFilterImpl {
    /**
     * 2013학번 학생들 중, CS가 아닌 사람은 17651이나 17652 과목을 들을 수 없다.
     * CS가 아닌 학생 중에 이 과목 ID를 수강한 학생들을 골라 이 과목 ID를 삭제하시오.
     * */
    @Override
    public boolean specificComputationForFilter() throws IOException {
        int checkBlank = 4;
        int numOfBlank = 0;
        boolean isBlank=false;
        int idx = 0;
        byte[] buffer = new byte[64]; //읽은 바이트들 저장
        int is17651=0;
        int is17652=0;
        int byte_read = 0;

        while(true) {
            while(byte_read != '\n' && byte_read != -1) {
                byte_read = in.read(); //한 바이트(한 글자)씩 읽음
                if(byte_read == ' ') isBlank=true; numOfBlank++;
                if(byte_read != -1) buffer[idx++] = (byte)byte_read;
                if(isBlank&& //빈칸이 4개를 넘어갔으며 빈칸일 때마다=과목체크할때마다
                    numOfBlank > checkBlank&&
                    buffer[idx-5]=='1'&&
                    buffer[idx-4]=='7'&&
                    buffer[idx-3]=='6'&&
                    buffer[idx-2]=='5'&&
                    buffer[idx-1]=='1')
                    is17651=idx-5;
                if(isBlank&&
                    numOfBlank>checkBlank&&
                    buffer[idx-5]=='1'&&
                    buffer[idx-4]=='7'&&
                    buffer[idx-3]=='6'&&
                    buffer[idx-2]=='5'&&
                    buffer[idx-1]=='2')
                    is17652=idx-5;
            }
            for(int i = 0; i<idx; i++){
                //17651과 17652 중 하나면 흘려보내지 않음
                if((is17651!=0||is17652!=0)&&
                        buffer[i]==' '&&buffer[i+1]=='1'&&buffer[i+2]=='7'&&buffer[i+3]=='6'&&buffer[i+4]=='5'&&
                        (buffer[i+5]=='1'||buffer[i+5]=='2')){
                    i=i+5;
                    continue;
                }
                out.write((char)buffer[i]);
            }

            if (byte_read == -1) return true; //반복문 종료
            //초기화
            isBlank=false;
            is17651=0;
            is17652=0;
            numOfBlank = 0;
            idx = 0;
            byte_read = '\0';
        }
    }
}
