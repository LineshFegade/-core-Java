package lab2;
import java.util.*;
public class Accounts {
	Scanner sc=new Scanner(System.in);
	private long accNumber;
	private String accHolderName;
	private long amount;
	private int choice;
	
	
	public int getChoice() {
		return choice;
	}
	public void setChoice(int choice) {
		this.choice = choice;
	}
	public long getAccNumber() {
		return accNumber;
	}
	public void setAccNumber(long accNumber) {
		this.accNumber = accNumber;
	}
	public String getAccHolderName() {
		return accHolderName;
	}
	public void setAccHolderName(String accHolderName) {
		this.accHolderName = accHolderName;
	}
	public long getBalance() {
		return amount;
	}
	public void setBalance(long amount) {
		this.amount = amount;
	}
	public Accounts() {
		accNumber = 2121235820;
		accHolderName = "akash joshi";
		amount = 1000;
		}
	public Accounts(long accNumber, String accHolderName, long amount) {
		super();
		this.accNumber = accNumber;
		this.accHolderName = accHolderName;
		this.amount = amount;
		}
	public void insert() {
		 try
		 {
			 System.out.println("Enter Account holder Name->");
			 accHolderName=sc.nextLine();
			 System.out.println("Enter the Ac_no :");
			 accNumber=sc.nextLong();
			 if(accNumber<1) {
				 throw new InvalidAccountNumberException("please enter valid account number...");
			 }
			 System.out.println("Enter amount");
			 amount =sc.nextLong();
			 if(amount<1) {
				 throw new InvalidAmountException("Amount must not be negavtive...");
			 }
		 }
		 catch(InvalidAccountNumberException ea) {
			 ea.printStackTrace();
		 }
		 catch(InvalidAmountException em) {
			 em.printStackTrace();
		 }
		 catch(Exception e) {
			 e.printStackTrace();
		 }
	 }
	 void Details() {
		 do {
			 System.out.println("Menu :\n1.Display.\n2.Deposit.\n3.withdraw.\n4.check_Balance");
			 System.out.println("Enter your choice :");
			 choice=sc.nextInt();
			 
			 switch(choice) {
			 case 1: 
				try {
					 System.out.println(" Account Holder Name :"+getAccHolderName());
					 System.out.println(" Ac_no :"+getAccNumber());
				 System.out.println("Enter amount :"+amount);
				 if(amount<1) {
					 throw new InvalidAmountException("Amount Must not be Negative.");
				 }
		
				 System.out.println("________________________________________________________________________________________");
				 
				}
				catch(InvalidAmountException ea) {
					ea.printStackTrace();
				}
				break;
			 
			 case 2:
				try {
					System.out.println(" Account Holder Name :"+getAccHolderName());
					System.out.println("Ac_no :"+getAccNumber());
				    System.out.println("Enter Diposit Amount :");
				     int deposit=sc.nextInt();
				     amount+=deposit;
				     if(deposit<100) {
				    	 throw new InvalidDepositException("Deposit must be grater than 100Rs.");
				     }
				      System.out.println("Total Balance is :"+amount);
	       		
				      System.out.println("________________________________________________________________________________________");

				}
				catch(InvalidDepositException ed) {
					ed.printStackTrace();
				}
				catch(Exception e) {
					e.printStackTrace();
				}

			        break;
			 case 3:
				 try {
					 System.out.println(" Account Holder Name :"+getAccHolderName());
					 System.out.println(" Ac_no :"+getAccNumber());
					 System.out.println("Enter your Withdraw Amount :");
				        float withdraw=sc.nextFloat();
				        amount-=withdraw;
				        if(amount<=withdraw) {
				        	throw new InvalidWithdrawAmountException("withdraw amount must be less than Total amount....");
				        }
				        System.out.println("Total Balance is :"+amount);
						 System.out.println("________________________________________________________________________________________"); 
				 }
				 catch(InvalidWithdrawAmountException ew){
					 ew.printStackTrace();
				 }
				 catch(Exception e) {
					 e.printStackTrace();
				 }
				 break;
			 case 4:
				 System.out.println("Account Holder Name :"+getAccHolderName());
				 System.out.println("Ac_no :"+getAccNumber());
				 System.out.println("current Balance is :"+amount);
				 System.out.println("________________________________________________________________________________________");

			 		break;
			 		default :System.out.println("Sorry....Wrong Choice...");
			 				 }
		 }while(choice!=4);
	
	
}
public static void main(String[] args) {
	Accounts a=new Accounts();
	a.insert();
	a.Details();
}	 
}
