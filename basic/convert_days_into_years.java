package basic;

import java.io.*;
import java.util.*;


public class convert_days_into_years {
/**
 * @param args
 */
public static void main(String[] args) {
	Scanner sc=new Scanner (System.in);
	
	System.out.println("Enter A DAYS :");
	int day=sc.nextInt();
	System.out.println(+day);
	
	int year=day/365;
	System.out.println("Years is :"+year);
	
	int month=(day%365)/12;
	System.out.println("months is :"+month);
	
	int week=(day%365)/7;
	System.out.println("weeks is :"+week);
	
	int days=(day%365)%7;
	System.out.println("days is :"+days);
	
	
}
}
