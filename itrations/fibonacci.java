package itrations;
import java.io.*;
import java.util.*;

public class fibonacci {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	int num1=0;
	int num2=1;
	 int sum;
	System.out.println("Enter the number :");
	int a=sc.nextInt();
	 for(int i=1;i<=a;i++) {
		 System.out.print(num1);
		sum= num1+num2;
		num1=num2;
		num2=sum;
		
	 }
}
}
