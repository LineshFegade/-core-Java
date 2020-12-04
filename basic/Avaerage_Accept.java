package basic;

import java.io.*;
import java.util.*;

public class Avaerage_Accept {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	
		System.out.println("Enter first paper mark");
		int a=sc.nextInt();
		System.out.println("MArathi :"+a);
	 
		System.out.println("Enter second paper mark");
		int b=sc.nextInt();
		System.out.println("Hindi :"+b);
		
		System.out.println("Enter third paper mark");
		int c=sc.nextInt();
		System.out.println("English :"+c);
		
		System.out.println("Enter fourth paper mark");
		int d=sc.nextInt();
		System.out.println("Maths :"+d);
		
		System.out.println("Enter first paper mark");
		int e=sc.nextInt();
		System.out.println("sciences :"+e);
		
		int sum=(a+b+c+d+e)/5;
		System.out.println("\n\nAvrage is :"+sum);
	}

}
