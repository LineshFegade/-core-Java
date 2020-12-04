package lab1;

public class InvalidAgeException extends Exception{
	String massage;
	
	public InvalidAgeException() {
		massage="Age Invalid";
	}
	
	public InvalidAgeException(String massage) {
		super();
		this.massage = massage;
	}

	@Override
	public String toString() {
		return "InvalidAgeException [massage=" + massage + "]";
	}
	
	
}
