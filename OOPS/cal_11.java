package OOPS;
import java.io.*;
import java.util.*;
public class cal_11 {
		void calsi() {
			Scanner sc=new Scanner(System.in);
		
		int choice,a,b,res1,res,res2;
		do {
		System.out.println("MENU : \n1.Add \n2.Subtract \n3.Multiply\n4.quit");
			System.out.println("Enter Your Choice :");
			choice=sc.nextInt();
			
		
			System.out.println("Enter the 2 Numbers :");
			a=sc.nextInt();
			b=sc.nextInt();
		
		 
			switch(choice) {
			case 1:
				res=a+b;
				System.out.println("Addition of 2 number is :"+res);
				break;
			case 2:res1=a-b;
			System.out.println("Subtraction of 2 number is :"+res1);
			break;
			case 3:res2=a*b;
			System.out.println("Multiplication of 2 number is :"+res2);
			break;
			case 4:System.out.println("quit");
			break;
			default :System.out.println("SORRY...Wrong choice...");
			}
		}while(choice!=4);
		}
		
	public static void main(String[] args) {
	cal_11 ob=new cal_11();
	ob.calsi();
}
}
