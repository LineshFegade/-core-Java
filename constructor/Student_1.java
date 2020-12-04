/*4.	Write a program to print the names of students by creating a Student class. 
    If no name is passed while creating an object of Student class, then the name should be "Unknown", 
    otherwise the name should be equal to the String value passed while creating object of Student class.*/
package constructor;

public class Student_1 {
	Student_1(){
		System.out.println("Unknow");
	}
	Student_1(String s){
		System.out.println(s);
	}
public static void main(String[] args) {
	Student_1 st=new Student_1();
	Student_1 stu=new Student_1("Linesh");
}
}
