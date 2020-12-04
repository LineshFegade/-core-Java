package method;
import java.util.*;
import java.io.*;
public class Mydate_1 {
	Scanner sc=new Scanner(System.in);
	int day,month,year;
	
	void setDate() {
		System.out.println("Enter day :");
		day=sc.nextInt();
		System.out.println("Enter month :");
		month=sc.nextInt();
		System.out.println("Enter Year :");
		year=sc.nextInt();
	}
	void DisplayDate() {
		System.out.println(day+" day "+month+" months "+year+" Year ");
	}
	public static void main(String[] args) {
		Mydate_1 ob=new Mydate_1();
		ob.setDate();
		ob.DisplayDate();
	} 
	

}
