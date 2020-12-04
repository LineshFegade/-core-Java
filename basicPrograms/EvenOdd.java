package lab1;
import java.util.*;
import java.io.*;

public class EvenOdd {
public static void main(String[] args) {
	int num;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Number :");
	num=sc.nextInt();
	if(num%2==0) {
		System.out.println("This Number is Even Number..");
	}
	else {
		System.out.println("This Number is Odd Number..");
	}
	
}
}
