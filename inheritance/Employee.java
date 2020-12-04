package inheritance;
public class Employee {
    private int empId;
    private String name;
    private MyDate joiningDate;
    private static String compunyName;

    static {
    	compunyName="Capgemini";
    }
    
    Employee(){
    	empId=206;
    	name="Akash";
    	joiningDate=new MyDate();
    }
    Employee(int empId,String name,MyDate joiningDate ){
    	this.empId=empId;
    	this.name=name;
    	this.joiningDate=joiningDate;
    }
    public void display(){
    	System.out.println("                 Compuny :"+getCompunyName()+"             ");
		System.out.println("Employee Id="+empId);
		System.out.println("Employee Name="+name);
		System.out.print("Joining Date=");
		joiningDate.display();
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public MyDate getJoiningDate() {
		return joiningDate;
	}
	public void setJoiningDate(MyDate joiningDate) {
		this.joiningDate = joiningDate;
	}
	public static String getCompunyName() {
		return compunyName;
	}
	public static void setCompunyName(String compunyName) {
		Employee.compunyName = compunyName;
	} 
}
