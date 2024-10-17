package server.exception;

public class InvalidValueException extends Exception{
    private int statusCode;

    //constructor
    public InvalidValueException(String message, int statusCode){
        super(message);
        this.statusCode=statusCode;
    }

    public int getStatusCode(){
        return statusCode;
    }

    @Override
    public String toString(){
        return statusCode+": "+super.getMessage();
    }
}