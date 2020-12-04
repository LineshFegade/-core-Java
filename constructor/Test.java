package constructor;
import java.io.*;
import java.util.*;
public class Test {
	Scanner sc=new Scanner(System.in);
	int d,fact=1,i=1;
	Test(){
		System.out.println("Without parameter constructor");
	}
	Test(int a){
	System.out.println("parameter constructor "+a);
	}
	void m1() {
		System.out.println("Enter the number :");
		d=sc.nextInt();
		if(d%2==0) {
			System.out.println("This is a Eevn number.");
		}
		else {
			System.out.println("This is odd number.");
		}
	}
	void m2(int b) {
	
		do {
			fact=fact*i;
			i++;
			
		}while(i<=b);
		System.out.println("Factorial is "+fact);
	}
	void m3(int b,int c) {
		int rem,sum=0;
		while(c>0) {
			rem=c%10;
			sum+=rem;
			c=c/10;
		
		}
		System.out.println("sum of DIGIT :"+sum);
		
	}
	public static void main(String[] args) {
		Test ob=new Test();
		Test ob1=new Test(5);
		ob.m1();
		ob.m2(5);
		ob.m3(0,12345);
		
		ob1.m1();
		ob1.m2(5);
		ob1.m3(0,1234);
		
	}
}
