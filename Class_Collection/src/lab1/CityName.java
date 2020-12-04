package lab1;

import java.util.Properties;
import java.util.Scanner;

public class CityName {

public static void main(String[] args) {
	 Properties p1=new Properties();
	 p1.put("Mumbai","0221");
	 p1.put("Pune","0211");
	 p1.put("Nashik","0253");
	 p1.put("satara", "02165");
	 p1.put("solapur", "0217");
	 p1.put("jalgaon","0257");
	 p1.put("akola","0724");
	 p1.put("sangli","0233");
	 p1.put("thane", "0252");
	 p1.put("Ratnagiri","0235");
	 
	 System.out.println("Number of city :-"+p1.size());
	do { 
	 System.out.print("Enter city name to search:");
		Scanner sc=new Scanner(System.in);
		String city=sc.next();
		
		 String info=p1.getProperty(city);
		if(info !=null)
			System.out.println("STD code :"+info);
		else
			System.out.println("City not found!!");
	}while(true);
	}
}
