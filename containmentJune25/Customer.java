package containmentJune25;

public class Customer {
	private long custId;
	 private String custName; 
	 private MyDate birthDate;
	 private Address custAddress;
	 
	 Customer(){
		 custId=204514;
		 custName="Alexa";
		 birthDate=new MyDate();
		 custAddress=new Address();
	 }
	 Customer(int custId, String custName,MyDate birthDate,Address custAddress ){
		 this.custId=custId;
		 this.custName=custName;
		 this.birthDate=birthDate;
		 this.custAddress=custAddress;
		 
	 }
	 
	 public long getCustId() {
		return custId;
	}
	public void setCustId(long custId) {
		this.custId = custId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public MyDate getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(MyDate birthDate) {
		this.birthDate = birthDate;
	}
	public Address getCustAddress() {
		return custAddress;
	}
	public void setCustAddress(Address custAddress) {
		this.custAddress = custAddress;
	}
	
	
	
	public void display() {
		System.out.println("Customer Name :-"+custName);
		System.out.println("Customer Id   :-"+custId);
		System.out.println("BirthDate is  :-");
		birthDate.display();
		System.out.println("Address :-");
		custAddress.display();
		
	}
	public static void main(String[] args) {
		Customer ob=new Customer();
		Customer ob1=new Customer(258720,"girish patil",new MyDate(22,03,2016),new Address("A/602,Ashirwad Society,kasarwadi,near D-mart","thane","Maharashtra",421004));
		Customer ob2=new Customer();
		ob2.setCustName("");
		ob2.setCustId(502358);
		ob2.setBirthDate(new MyDate(5,8,1998));
		ob2.setCustAddress(new Address("A3-501,panvelkar nagri,katrap","badlapur","Maharashtra",421503));
		
		System.out.println("*****Customer Details*****");
		ob.display();
		System.out.println("------------------------------------------------------------------");
		ob1.display();
		System.out.println("------------------------------------------------------------------");
		ob2.display();
		
	}
}
/*
 * QUEASTIONS____ write 2 classes MyDate---->day,month,year
 * Address---->street,city,state,country,pinCode
 * 
 * write a class Customer-----> int custId String custName Address custAddr
 * MyDate birthDate
 * 
 * write a clientcode TestCustomer----> create 3 objects & invoke display on it
 */