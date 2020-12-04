package lab2;

public class InvalidAccountNumberException extends Exception {
	private String massage;
	
	public InvalidAccountNumberException() {
		
		massage = "Invalid Account Number...";
	}
	
	@Override
	public String toString() {
		return "InvalidAccountNumberException [massage=" + massage + "]";
	}

	public InvalidAccountNumberException(String massage) {
		super();
		this.massage = massage;
	}

	public String getMassage() {
		return massage;
	}

	public void setMassage(String massage) {
		this.massage = massage;
	}
	
}
