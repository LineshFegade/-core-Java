package containment2;

public class TestStudent {
public static void main(String[] args) {
	Student s1=new Student();
	Student s2=new Student("Aniket patil",8,new int[] {88,75,73,58,80},new MyDate(7,5,2002),new Admission(15,6,2008));
	Student s3=new Student();
	s3.setName("Akash Rathod");
	s3.setRollNo(10);
	s3.setMarks(new int[] {69,72,76,87,81});
	s3.setBirthDate(new MyDate(5,3,2000));
	s3.setAdmissionDate(new Admission(12,6,2007));
	
	s1.display();
	System.out.println("--------------------------------------------------");
	s2.display();
	System.out.println("---------------------------------------------------");
	s3.display();
	System.out.println("------------------------------------------------------");
}
}
