package itrations;
import java.io.*;
import java.util.*;
public class digit_count {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	int num=sc.nextInt();
	int count=0,rem;
	while(num>0) {
		rem=num%10;
		num=num/10;
		count++;
	}
	System.out.println("Total number of digit is :"+count);
}
}
