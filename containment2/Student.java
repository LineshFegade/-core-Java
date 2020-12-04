package containment2;
import java.util.*;
public class Student {
	//Scanner sc=new Scanner(System.in);
	float sub1,sub2,sub3,sub4,sub5,mark=0,result=0;
	int[] marks;
	private int  rollNo;
	private String name;
	private MyDate birthDate;
	private Admission AdmissionDate;
	private static String university;
	
	static {
		university="Mumbai University";
	}
	Student(){
		rollNo=05;
		name="Rahul";
		marks=new int[] {81,75,86,66,76};
		birthDate=new MyDate();
		AdmissionDate=new Admission();
	}
	Student(String name,int rollNo,int[]ma,MyDate birthDate,Admission AdmissionDate){
		this.name=name;
		this.rollNo=rollNo;
		this.birthDate=birthDate;
		this.marks=ma;
		this.AdmissionDate=AdmissionDate;
	}	
	public int[] getMarks() {
		return marks;
	}
	public void setMarks(int[] marks) {
		this.marks = marks;
	}
	public int total() {
		int toTal=0,i;
		for(i=0;i<marks.length;i++) {
			toTal+=marks[i];
		}
		return toTal;
	}
	public float  persentage(int toTal) {
		float per;
		per=(100*toTal)/500;
		return per;
	}
	public  int CalculateGrade(float per) {
		if(per>=90) {
			System.out.println(" Grade A");
		}
		else if(per>90 && per>=80) {
			System.out.println("Grade B");
		}
		else if(per>80 && per >=70) {
			System.out.println("grade C");
		}
		else if(per>70 && per>=60) {
			System.out.println("grade D");
		}
		else if(per>60 && per>=50) {
			System.out.println("grade E");
		}
		else if(per>50 && per>=40) {
			System.out.println("Grade ");
		}
		else {
			System.out.println("Fail");
		}
		return 1;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public MyDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(MyDate birthDate) {
		this.birthDate = birthDate;
	}

	public Admission getAdmissionDate() {
		return AdmissionDate;
	}

	public void setAdmissionDate(Admission admissionDate) {
		AdmissionDate = admissionDate;
	}

	public static String getUniversity() {
		return university;
	}

	public static void setUniversity(String university) {
		Student.university = university;
	}
	public void display() {
		System.out.println("		University :-"+getUniversity()+"			");
		System.out.println("Student Name   :-"+name);
		System.out.println("Student RollNo :-"+rollNo);
		System.out.print("Student Birthdate:-");birthDate.display();
		System.out.print("Student AdmissionDate:-");AdmissionDate.display();
		System.out.println("Student Marks Total:-");
		for(int i=0;i<marks.length;i++) {
			System.out.println(marks[i]);
		}
		int totalMarks=total();
		System.out.println("Tottal Marks :-"+totalMarks);
		float perSentage=persentage(totalMarks);
		System.out.println("Persentage is:-"+perSentage+"%");
		 CalculateGrade(perSentage);		
	}
}
