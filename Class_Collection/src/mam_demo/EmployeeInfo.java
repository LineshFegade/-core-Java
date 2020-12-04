package mam_demo;

public class EmployeeInfo {
	private int empId;
	private String empName;
	private double salary;
	public EmployeeInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EmployeeInfo(int empId, String empName, double salary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "EmployeeInfo [empId=" + empId + ", empName=" + empName
				+ ", salary=" + salary + "]";
	}
}
