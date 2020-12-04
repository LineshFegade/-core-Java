package constructor;

public class Cycle {
	int accountNo,noOfWheels;
	Cycle(){
		System.out.println("I am a Default Construtor");
	}
	Cycle(int accountNo,int noOfWheels){
		this();
		System.out.println("i am th onther constructor");
	}
public static void main(String[] args) {
	
	Cycle ob=new Cycle(3,5);
	
}
}
