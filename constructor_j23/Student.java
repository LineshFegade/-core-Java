package constructor_j23;
import java.util.*;
import java.io.*;
public class Student {
	Scanner sc=new Scanner(System.in);
			
	int rollNo,std,sum=0,sub1,sub2,sub3,sub4,sub5,result;
	String name;
	char div;
	Student(){
		System.out.println("#####Student Data#####");
	}
	Student(String name,int rollNo,int std,char div){
		this.name=name;
		this.rollNo=rollNo;
		this.std=std;
		this.div=div;
	}
	void info() {
		System.out.println("Enter Student Name :-");
		name=sc.nextLine();
		System.out.println("Enter Roll-Number :-");
		rollNo=sc.nextInt();
		System.out.println("Enter Std :-");
		std=sc.nextInt();
		System.out.println("Enter Div :-");
		div=sc.next().charAt(0);
	}
	void  marks() {
		System.out.println("Enter 5 Subjects :-");
		sub1=sc.nextInt();sub2=sc.nextInt();sub3=sc.nextInt();sub4=sc.nextInt();sub5=sc.nextInt();
		sum=sub1+sub2+sub3+sub4+sub5;
	}
	int percentage() {
		result=(sum*100)/500;
		System.out.println("Persentage is :-"+result);
		return result;
	}
	void Display() {
		System.out.println("student name-->"+name);
		System.out.println("Student Roll no-->"+rollNo);
		System.out.println("Studnet Standard-->"+std);
		System.out.println("Student Div-->"+div);
		System.out.println("Studnet persentage-->"+result);
	}	
	
	
	public static void main(String[] args) {
		Student ob=new Student();
		Student stu=new Student("linesh",10,12,'A');
		stu.info();
		stu.marks();
		stu.percentage();
		System.out.println("-----DETAILS-----");
		stu.Display();
	}

}
