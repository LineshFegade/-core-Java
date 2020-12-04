package lab2;

public class TestCar {
	public static void main(String[] args) {
		Bond b1=new Bond(new ferrari());
		Bond b2=new Bond(new BMW());
		b1.drive();
		b2.drive();
	}
		
}
