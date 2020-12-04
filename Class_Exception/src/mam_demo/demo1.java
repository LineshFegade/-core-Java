package mam_demo;

public class demo1 {
public static void main(String[] args) {
	
	try {
		//task1
			int num1=10,num2=5,result;
			result=num1/num2;
			System.out.println("REsult="+result);
	} catch (ArithmeticException e) {
		System.out.println("ERROR in Division operation!!");
	}
	
	try {
		//task2
			int[] arr={10,20,30,40,50};
			//int[] arr=null;
			for (int i = 0; i < arr.length; i++) {
		 		System.out.print("  "+arr[i]);
			}
	} //cascading catch blocks
	catch (NullPointerException e) {
		System.out.println("Array is null");
	}
	catch (ArrayIndexOutOfBoundsException e) {
		System.out.println("You are trying to access array beyond its limits");
	}
	catch (Exception e) {
		System.out.println("ERROR in Array operations");
	}
	
	try {
			//task3
			System.out.println("\n\n\t\tHello");
		} //general catch
	catch (Exception e) {
			System.out.println("ERROR in printing task");
		}		
		
		System.out.println("Done!");
	  
}
}
