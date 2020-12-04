package OOPS;
import java.io.*;
import java.util.*;
public class minconvert_7 {
	Scanner sc=new Scanner(System.in);
	float year,Day,min,remain;
	void convert() {
		System.out.println("Enter the Minute");
		min=sc.nextInt();
		year=min/525600;
		Day=min/1440;		
		remain=Day%525600;
		System.out.println(min + " minutes is " + year + " years and "  +  remain + " days ");
		
	}
public static void main(String[] args) {
	minconvert_7 ob =new minconvert_7();
	ob.convert();
}
}
