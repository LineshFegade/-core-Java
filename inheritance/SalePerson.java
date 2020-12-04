package inheritance;

public class SalePerson extends Employee{
	private long totalSalary;
	private long commission;
	
	SalePerson(){
		super();
		totalSalary=89500;
		commission=10;
	}
	SalePerson(int empId,String name,MyDate joiningDate,long totalSalary,long commission){
		super(empId,name,joiningDate);
		this.totalSalary=totalSalary;
		this.commission=commission;
	}
	
	 public void  calSalePersonSalary() {
		 totalSalary=(totalSalary*commission)/100;
		System.out.println("Basic Salary :-"+totalSalary);
	}
	 public void display() {
		 super.display();
		 System.out.println("Total Salary :-"+totalSalary);
		 System.out.println("Commission   :-"+commission);
		 calSalePersonSalary();

	 }
	public long getTotalSalary() {
		return totalSalary;
	}
	public void setTotalSalary(long totalSalary) {
		this.totalSalary = totalSalary;
	}
	public long getCommission() {
		return commission;
	}
	public void setCommission(long commission) {
		this.commission = commission;
	}
	
	
}
