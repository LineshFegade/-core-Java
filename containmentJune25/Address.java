package containmentJune25;

public class Address {
	 private String street,city,state;
	 private long pinCode;
	 private static String contry;
	 static {
		 contry="India";
	 }
	 
	 Address(){
		 street="B4-102,Runwall seagull society,handewadi read,hadpsar";
		 city="Pune";
		 state="Maharashtra";
		 pinCode=411028; 
	 }
	 Address(String street,String city,String state,long pinCode){
		 this.street=street;
		 this.city=city;
		 this.state=state;
		 this.pinCode=pinCode;
		 
	 }
	 
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Long getPinCode() {
		return pinCode;
	}
	public void setPinCode(Long pinCode) {
		this.pinCode = pinCode;
	}
	public static String getContry() {
		return contry;
	}
	public static void setContry(String contry) {
		Address.contry = contry;
	}
	 public void display() {
		 System.out.println("street :-"+street);
		 System.out.println("City   :-"+city);
		 System.out.println("State  :-"+state);
		 System.out.println("Pincode:-"+pinCode);
		 System.out.println("Contry :-"+Address.getContry());
	 }
	 
	 
	 
	 
	 
	 
	 
	 
	 
}
