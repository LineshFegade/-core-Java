package lab1;
import java.util.*;

import mam_demo.InvalidAgeException;
public class Bloodgroup {
	public static void main(String[] args) {
		try {
			Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Name :-");
		String name=sc.next();
		
		System.out.println("Enter your Age :-");
		int age=sc.nextInt();
		
	
		if(age<1) {
			throw new InvalidAgeException("Age Must Not be nigative ...");}
		else if(age>100) {
			throw new InvalidAgeException("Age must not exceed 100");}
			else {
				System.out.println("Age is :-"+age);}
		}
		catch(InvalidAgeException ea){
			ea.printStackTrace();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		try {
			Scanner s=new Scanner(System.in);
			System.out.println("Enter your Blood group :-");
			String blood=s.next();
			
			if(blood.equals("A+") ||blood.equals("B+") || blood.equals("AB+") || blood.equals("A-") || blood.equals("B-") || blood.equals("AB-") || blood.equals("o+")|| blood.equals("o-"))
			{
				System.out.println("Blood group is : " +blood);
			}
			else
			{
				throw new InvalidBloodGroupException("Enter valid Blood Group...");
			}
		}	
			catch(InvalidBloodGroupException eb) {
				eb.printStackTrace();
				
			}
			catch (Exception e) {
				e.printStackTrace();
			}		
	}
}
