package basic;
import java.io.*;
import java.util.*;

public class Compund_intrest {
public static void main(String[] args) {
	 Scanner input = new Scanner(System.in);

     double principal = 0;
     double rate = 0;
     double time = 0;

     double compoundInterest = 0;
 
     System.out.print("Enter the Principal amount : "); 
     principal = input.nextDouble();

     System.out.print("Enter the Rate : "); 
     rate = input.nextDouble();

     System.out.print("Enter the Time : "); 
     time = input.nextDouble();

     compoundInterest = principal * Math.pow((1 + rate/100),time); 
   
     System.out.println("");
     System.out.println("The Compound Interest is : "
    + compoundInterest);
	
}
}
