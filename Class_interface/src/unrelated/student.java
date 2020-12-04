package unrelated;

public class student implements Pritable {
	private int rollNo;
	private String studentName;
	
	public student() {
		studentName="Ashitosh";
		rollNo=85;
	}
	
	public student(String studentName,int rollNo) {
		this.studentName=studentName;
		this.rollNo=rollNo;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	public void print(){
		System.out.println("\t**student Details**");
		System.out.println("Student Name:"+getStudentName());
		System.out.println("Student RollNo:"+getRollNo());
		
	}

}
