package inheritance;

public class Manager extends Employee{
	private double basicSalary;
	 private double hra,ta,pf,pt,totalSalary;
	Manager(){
		super();
		basicSalary=95000;
		hra=0.2*basicSalary;
		ta=0.1*basicSalary;
		pf=0.1*basicSalary; 
		pt=0.05*basicSalary;
	   totalSalary=basicSalary+hra+ta-pf-pt;
	}
	Manager(int empId,String name,MyDate joiningDate,double basicSalary ){
		super(empId,name,joiningDate);
		this.basicSalary=basicSalary;
		hra=0.2*basicSalary;
		ta=0.1*basicSalary;
		pf=0.1*basicSalary; 
		pt=0.05*basicSalary;
	   totalSalary=basicSalary+hra+ta-pf-pt;
	}
	public void display() {
		super.display();
		System.out.println("Basic  Salary :-"+basicSalary);
		System.out.println("Total Salary  :-"+totalSalary);
	}
	public double getBasicSalary() {
		return basicSalary;
	}
	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}
	public double getHra() {
		return hra;
	}
	public void setHra(double hra) {
		this.hra = hra;
	}
	public double getTa() {
		return ta;
	}
	public void setTa(double ta) {
		this.ta = ta;
	}
	public double getPf() {
		return pf;
	}
	public void setPf(double pf) {
		this.pf = pf;
	}
	public double getPt() {
		return pt;
	}
	public void setPt(double pt) {
		this.pt = pt;
	}
	public double getTotalSalary() {
		return totalSalary;
	}
	public void setTotalSalary(double totalSalary) {
		this.totalSalary = totalSalary;
	}
}
