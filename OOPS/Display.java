package OOPS;
import java.io.*;
import java.util.*;

public class Display {
	Scanner sc=new Scanner(System.in);
	int res,a,b;
	int res1;
	int res2;
   
	void add() {
		System.out.println("Enter the 2 number:");
		a=sc.nextInt();
		b=sc.nextInt();
		res=a+b;
		System.out.println("Method 1:"+res);
	}
	void multi() {
		res1=a*b;
		System.out.println("Method 2:"+res1);
	}
	void sub() {
		res2=a-b;
		System.out.println("Method 3:"+res2);
	}
public static void main(String[] args) {
	Display ob=new Display();
	Display ob1=new Display();
	ob.add();
	ob.multi();
	ob.sub();
	 
	ob1.add();
	ob1.multi();
	ob1.sub();
	
}
}
