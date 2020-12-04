package OOPS;
import java.io.*;
import java.util.*;
public class triangle_5 {
		Scanner sc=new Scanner(System.in);
		int a,b,c,sum=0;
	void find() {
		System.out.println("Enter the 3 angle of triangle :");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		sum=a+b+c;
		if(sum==180) {
			System.out.println("triangle is a VALID...");
		}
		else {
			System.out.println("triangle is NOT VALID...");
		}
	}
public static void main(String[] args) {
	triangle_5 ob=new triangle_5();
	ob.find();
}
}
