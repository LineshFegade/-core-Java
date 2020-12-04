package inharitance;


class Emloyee{
	String employeeName,employee_Address;
	long employeeId,employee_Phone;
	double BasicSalary,specialAllowance=250.80d,HRA=1000.50d;
		Emloyee(int id,String name,String Address,long phone_no){
			this.employeeId=id;
			this.employeeName=name;
			this.employee_Address=Address;
			this.employee_Phone=phone_no;
			
		}
		void calculateSalary () {
			double salary;
			salary=BasicSalary + (BasicSalary *specialAllowance/100) + (BasicSalary *HRA/100);
			System.out.println(salary);
		}
		void Display() {
			System.out.println("id "+employeeId+"name "+employeeName+"Address "+employee_Address+"Phone "+employee_Phone+"BasicSalary"+BasicSalary);
		}
}
class Manager1 extends Emloyee{
	
	  Manager1(int id,String name,String Address,long phone_number,int salary){
		  super(id,name,Address,phone_number);
		  super.employeeId=id;
			super.employeeName=name;
			super.employee_Address=Address;
			super.employee_Phone=phone_number;
			super.BasicSalary=salary;
	  }
}


 class Trainee extends Emloyee{ 
	 
 Trainee(int id,String name,String Address,long phone_number,double salary){ 
	 super( id,name,Address,phone_number);
	 	super.employeeId=id; 
	 	super.employeeName=name;
	 	super.employee_Address=Address; 
	 	super.employee_Phone=phone_number;
	 	super.BasicSalary=salary; 
   }
 
 }
 
public class Hand_on {
public static void main(String[] args) {
	Manager1 M=new Manager1(126534,"peter","pune india",237844,65000);
	M.Display();
	M.calculateSalary();
	Trainee T=new Trainee(29846,"Jack","Mumbai India",442085,45000);
	T.Display();
	T.calculateSalary();
}
}
