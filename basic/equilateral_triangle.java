package basic;

import java.util.Scanner;

public class equilateral_triangle {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter side of trangle :");
	float a=sc.nextFloat();
	
	double result=(1.73*a*a)/4;
	System.out.println("Area of equilteral trangle is :"+result);
}
}
