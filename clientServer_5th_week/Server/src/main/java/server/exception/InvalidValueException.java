package server.exception;

public class InvalidValueException extends Exception{
    private int statusCode;

    //constructor
    public InvalidValueException(ErrorList errorList){
        super(errorList.getMessage());
        this.statusCode=errorList.getState();
    }

    public int getStatusCode() {return statusCode;}

    @Override
    public String toString(){
        return statusCode+": "+super.getMessage();
    }
}