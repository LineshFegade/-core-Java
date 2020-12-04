package OOPS;
import java.io.*;
import java.util.*;
public class length_6 {
	Scanner sc=new Scanner(System.in);
	float cm,meter,km;
	void length() {
		System.out.println("Enter length in the centimeter : ");
		cm=sc.nextInt();
	   meter=cm/100.0f;
	   System.out.println("length in meter :"+meter+"m");
	   km=cm/100000.0f;
	   System.out.println("length is kelometer :"+km+"km");
	}
	
	
	
	
	
	public static void main(String[] args) {
		length_6 ob=new length_6();
		ob.length();
}
}
