package basic;

import java.io.*;
import java.util.*;
public class Min_Max {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the First Number :");
		int a=input.nextInt();
		
		System.out.println("Enter The Second Number :");
		int b =input.nextInt();
		if(a>b) {
			System.out.println("First Number is Maximum...");
		}
		else {
			System.out.println("Second Number is Maximum...");
		}
	}

}
