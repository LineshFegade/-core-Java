package mam_demo;
import java.util.*;
public class demo3 {

public static void main(String[] args) {
		
		try {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter your age:");
			int age=sc.nextInt();
			if(age<1)
				throw new InvalidAgeException("Age cannot be negative");
			else if(age>100)
				throw new InvalidAgeException("Age cannot exceed 100");
			else
			{
				if(age>=18)
					System.out.println("You are elligible for voting!!");
				else
					System.out.println("You are not elligible for voting!!");
			}	
			
		} 
		catch (InvalidAgeException e) {
			e.printStackTrace();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
