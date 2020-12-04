package mam_demo;

import java.util.InputMismatchException;
import java.util.*;
public class demo2 {
	public static void main(String[] args) {		
		try {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter First No:");
			int firstNo=sc.nextInt();
			System.out.println("Enter Second No:");
			int secondNum=sc.nextInt();
			
			if(firstNo<0 || secondNum <0)
				throw new ArithmeticException("Negative numbers not allowed!!");
			else{			
				int result=firstNo+secondNum;
				System.out.println("Addition="+result );
			}					
		}
		catch(ArithmeticException ex){
			ex.printStackTrace();
		}		
		catch (InputMismatchException e) {
			System.out.println("PLease provide proper values");
		}
		
		
		System.out.println("Done!!");
		
	}
}
