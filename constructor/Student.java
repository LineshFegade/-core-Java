package constructor;
import java.util.*;
import java.io.*;
public class Student {
	Scanner sc=new Scanner(System.in);
	int sum=0,per,sub1,sub2,sub3,sub4,sub5;
	int roll_no,std;
	char div;
	String name;
	Student(){
		System.out.println("****Enter the student Deta****");
	}
	Student(String name,int roll_no,int std,char div){
		this.name=name;
		this.roll_no=roll_no;
		this.std=std;
		this.div=div;
		
	}
	void info() {
		System.out.println("Student name :");
		name=sc.nextLine();
		System.out.println("Roll no :");
		roll_no=sc.nextInt();
		System.out.println("STD :");
		std=sc.nextInt();
		System.out.println("Div :");
		div=sc.next().charAt(0);
	}
	void marks() {
		System.out.println("Enter 5 subject marks :");
		sub1=sc.nextInt();sub2 =sc.nextInt();
		sub3=sc.nextInt();sub4 =sc.nextInt();sub5=sc.nextInt();
	}
	int percentage() {
		sum=sub1+sub2+sub3+sub4+sub5;
		per=(sum*100)/500;
		System.out.println("percentages is-->"+per);
		return per;
	}
	void Display() {
		System.out.println("student name-->"+name);
		System.out.println("Student Roll no-->"+roll_no);
		System.out.println("Studnet Standard-->"+std);
		System.out.println("Student Div-->"+div);
		System.out.println("Studnet persentage-->"+per);
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
