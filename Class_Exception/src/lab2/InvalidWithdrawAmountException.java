package lab2;

public class InvalidWithdrawAmountException extends Exception {
	private String massage;

	public String getMassage() {
		return massage;
	}

	public void setMassage(String massage) {
		this.massage = massage;
	}

	public InvalidWithdrawAmountException(String massage) {
		super();
		this.massage = massage;
	}

	@Override
	public String toString() {
		return "InvalidWithdrawAmountException [massage=" + massage + "]";
	}
	
}
