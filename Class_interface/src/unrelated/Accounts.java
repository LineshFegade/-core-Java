package unrelated;

public class Accounts implements Pritable {
	private String accountHolderName;
	private long accountNumber,balance;
	
	public Accounts() {
		accountHolderName="Rahul";
		accountNumber=857922268;
		balance=8500;		
	}
	public Accounts(String accountHolderName,long accountNumber,long balance) {
		this.accountHolderName=accountHolderName;
		this.accountNumber=accountNumber;
		this.balance=balance;
	}
	
	public String getAccountHolderName() {
		return accountHolderName;
	}


	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}


	public long getAccountNumber() {
		return accountNumber;
	}


	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}


	public long getBalance() {
		return balance;
	}


	public void setBalance(long balance) {
		this.balance = balance;
	}


	@Override
	public void print(){
		System.out.println("\t**Acconts Details**");
		System.out.println("Account Holder Name :-"+accountHolderName);
		System.out.println("Account Number :-"+accountNumber);
		System.out.println("Balance  :-"+balance);
	
	}

}
