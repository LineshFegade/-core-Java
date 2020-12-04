package itrations;
import java.io.*;
import java.util.*;
public class palindrom {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	 
	System.out.println("Enter the number");
	int num=sc.nextInt();
	 int sum=0;
	 int temp=num,r;
	 while(num>0) {
		 r=num%10;
		 num/=10;
		 sum=(sum*10)+r;
	 }
	 if(temp==sum) {
		 System.out.println("number is palindrome");
	 }
	 else {
		 System.out.println("Number is NOT palindrome");
	 }
}
}
