package lab2;

public class InvalidAmountException extends Exception {
	 private String massage;
	 public InvalidAmountException() {
			
			this.massage ="Invalid Amount you are enter...";
		}
	 
	public InvalidAmountException(String massage) {
		super();
		this.massage = massage;
	}
	 
}
