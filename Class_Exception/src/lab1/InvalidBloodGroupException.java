package lab1;

public class InvalidBloodGroupException extends Exception {
	String massage;
	public InvalidBloodGroupException() {
		
	massage = "Invalid Blood Group..";
	}
	
	
	public InvalidBloodGroupException(String massage) {
		super();
		this.massage = massage;
	}


	@Override
	public String toString() {
		return "InvalidBloodGroupException [massage=" + massage + "]";
	}
	
	
}
