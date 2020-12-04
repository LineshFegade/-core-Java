package lab2;

public class InvalidDepositException extends Exception {
	private String massage;

	public String getMassage() {
		return massage;
	}

	public void setMassage(String massage) {
		this.massage = massage;
	}

	public InvalidDepositException(String massage) {
		super();
		this.massage = massage;
	}

	@Override
	public String toString() {
		return "InvalidDepositException [massage=" + massage + "]";
	}
	
	
}
