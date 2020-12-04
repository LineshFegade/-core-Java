package inharitance;

class Department{
	int id;
	
	public Department(int id) {
		this.id=id;
	}
}


public class Student_Containment_4 extends Department{
	int roll_no;
	String name;
	Department d;
	
	public Student_Containment_4(int roll_no, String name,Department d) {
		super(d.id);
		this.roll_no=roll_no;
		this.name=name;
		
	}
	void display() {
		
		System.out.println("Id-"+id+" Name-"+name+" eroll no-"+roll_no);
	}
	
	
	
	public static void main(String[] args) {
		Student_Containment_4 ob=new Student_Containment_4(101, "Linesh", new Department(5));
		ob.display();
	}
	
}
