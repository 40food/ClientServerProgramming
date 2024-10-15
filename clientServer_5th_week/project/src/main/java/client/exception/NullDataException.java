package client.exception;

public class NullDataException extends Exception{
    public NullDataException(String errorMessage){
        super(errorMessage);
    }
    //우리의 error message를 부모하듯이 전달
    //아주 기본적인 것일 뿐이고 custom 가능
    public void retry(){
        //안 되면 몇 번 더 호출하라 등
    }
}
