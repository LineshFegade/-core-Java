package lab2;

public class Bond {
	car myCar;
	
	public Bond(car cars) {
		this.myCar=cars;
	}
	
	public void drive() {
		myCar.run();
	}
}
