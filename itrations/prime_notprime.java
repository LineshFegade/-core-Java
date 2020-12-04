package itrations;
import java.io.*;
import java.util.*;
public class prime_notprime {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a Number :");
	int num=sc.nextInt();
	int count=0;
	for(int i=1;i<=num;i++) {
		if(num%i==0) {
			count++;
		}
	}
		if(count==2) {
			System.out.println("This is a prime number...");
		}
		else {
			System.out.println("This is a NOT prime number...");
		}
		
	
}
}
