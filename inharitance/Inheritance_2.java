package inharitance;
import java.io.*;
import java.util.*;
class Member{
	Scanner s=new Scanner(System.in);
	int age,phoneNumber,salary;
	String Address,Name;
	
	void printSalary() {

	    System.out.println("Enter Salary :");
	    salary=s.nextInt();
	    
	}
}
class Employee extends Member{
	Scanner sc=new Scanner(System.in);
	public String Spaicalization;

	/*
	 * void sp() { }
	 */	
	void Data() {
	System.out.println("Enter name :");
	Name=sc.nextLine();
	System.out.println("Enter address :"); 
    Address=sc.nextLine();
    System.out.println("Enter phoneNumber :");
    phoneNumber=sc.nextInt();
    System.out.println("Enter Salary :");
    salary=sc.nextInt();
    System.out.println("Enter age :");
    age=sc.nextInt();
    System.out.println("Enter the spaicializations :");
    Spaicalization=sc.next();
    
	}
}
class Manager extends Employee{
	String department;
	Scanner ss=new Scanner(System.in);
	void man() {
		System.out.println("Enter department :");
		department=ss.nextLine();
	}
	void display(){
		System.out.println("*****************************DETAILS*************************************");
		super.salary=salary;
		
		System.out.println("Name :"+Name);
		System.out.println("address :"+Address);
		System.out.println("age  :"+age);
		System.out.println("Phone number :"+phoneNumber);
		System.out.println("Salary :"+salary);
		System.out.println("Department :"+department);
		System.out.println("Spaicalization:"+Spaicalization);

	}
}
public class Inheritance_2 {
	public static void main(String[] args) {
		
		
		Manager M=new Manager();
		M.printSalary();
		M.Data();
		M.man();
		M.display();
		
		
	}
}
