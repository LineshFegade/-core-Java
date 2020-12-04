package mamDemo;

public class AccountThread {
	private int accNo;
	private String accHolderName;
	private double balnace;
	public AccountThread(int accNo, String accHolderName, double balnace) {
		super();
		this.accNo = accNo;
		this.accHolderName = accHolderName;
		this.balnace = balnace;
	}
	public int getAccNo() {
		return accNo;
	}
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	public String getAccHolderName() {
		return accHolderName;
	}
	public void setAccHolderName(String accHolderName) {
		this.accHolderName = accHolderName;
	}
	public double getBalnace() {
		return balnace;
	}
	public void setBalnace(double balnace) {
		this.balnace = balnace;
	}
	@Override
	public String toString() {
		return "AccountThread [accNo=" + accNo + ", accHolderName=" + accHolderName + ", balnace=" + balnace + "]";
	}
	
}
