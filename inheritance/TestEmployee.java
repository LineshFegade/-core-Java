package inheritance;

public class TestEmployee extends Employee {
	
	public static void main(String[] args) {
		WageEmployee we1=new WageEmployee();
		WageEmployee we2=new WageEmployee(102,"krish",new MyDate(6, 7, 2019),200,120);
		WageEmployee we3=new WageEmployee();
		we3.setEmpId(103);
		we3.setName("Robert");
		we3.setJoiningDate(new MyDate(5,6,2012));
		we3.setHours(300);
		we3.setRate(450);
		System.out.println("\t\tWage Employee Dtails ");
		we1.display();
		System.out.println("_________________________________________________________");
		we2.display();
		System.out.println("_________________________________________________________");
		we3.display();
		System.out.println("_________________________________________________________");
		
		
		SalePerson s1=new SalePerson();
		SalePerson s2=new SalePerson(502,"arjun",new MyDate(16, 10, 2017),45000,10);
		SalePerson s3=new SalePerson();
		s3.setEmpId(723);
		s3.setName("Mandar");
		s3.setJoiningDate(new MyDate(23,9,2015));
		s3.setTotalSalary(52000);
		s3.setCommission(15);
		System.out.println("\t\tSale Employee Dtails ");
		s1.display();
		System.out.println("_________________________________________________________");
		s2.display();
		System.out.println("_________________________________________________________");
		s3.display();
		System.out.println("_________________________________________________________");
		
		
		
		Manager m1=new Manager();
		Manager m2=new Manager(552,"Harshal",new MyDate(28, 11, 2010),85000);
		Manager m3=new Manager();
		m3.setEmpId(189);
		m3.setName("kartik");
		m3.setJoiningDate(new MyDate(18,2,2018));
		m3.setBasicSalary(75000);
		System.out.println("\t\t Manager Employee Dtails ");
		m1.display();
		System.out.println("_________________________________________________________");
		m2.display();
		System.out.println("_________________________________________________________");
		m3.display();
		System.out.println("_________________________________________________________");
		
		
		
		
	}
}
