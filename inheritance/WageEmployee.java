package inheritance;

public class WageEmployee extends Employee {
	private int hours;
	private double rate;
	
	public WageEmployee() {
		super();
		hours=450;
		rate=500;
	}
	public WageEmployee(int eid,String name,MyDate joinDate, int startWork,double rate) {
			super(eid,name,joinDate);
			this.hours=startWork;
			this.rate=rate;
	}
	public void display(){
		super.display();
		System.out.println("Hours="+hours);
		System.out.println("Rate="+rate);	
		System.out.println("Total Salary="+calculateSalary());
	}
	
	//business method
	public double calculateSalary(){
		return hours * rate;
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}
}
