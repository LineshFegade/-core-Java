package OOPS;
import java.io.*;
import java.util.*;
public class swap {
	Scanner sc=new Scanner(System.in);
	int a,b,temp;
	void SWAP() {
		System.out.println("Enter the 2 number");
		 a=sc.nextInt();
		 b=sc.nextInt();
		 System.out.println("Befor swapping :"+a+" "+b+" ");
		 temp=a;
		 a=b;
		 b=temp;
		 System.out.println("After swapping :"+a+" "+b+" ");
		 
	}
	
	public static void main(String[] args) {
	swap ob=new swap();
	ob.SWAP();
}
}
