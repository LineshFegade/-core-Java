package mam_demo;

public class InvalidAgeException extends Exception{

	String message;
	 InvalidAgeException(){
		message="Invalid Age!!";
	}
	public InvalidAgeException(String msg){
		message=msg;
	}

	@Override
	public String toString() {
		return "InvalidAgeException [message=" + message + "]";
	}
	
}
