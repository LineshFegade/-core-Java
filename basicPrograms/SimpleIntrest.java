package lab1;
import java.util.*;
import java.io.*;
public class SimpleIntrest {
public static void main(String[] args) {
	float principle,intrest,period,res;
	 Scanner sc = new Scanner(System.in);	
	 System.out.println("Enter the principle Amount :");
	 principle = sc.nextFloat();
	 System.out.println("Enter the Rate of Intrest : ");
	 intrest=sc.nextFloat();
	 System.out.println("Enter the Time period : ");
	 period=sc.nextFloat();
	 
	 res=(principle*intrest*period)/100;
	 System.out.println("Simple Intrest is :"+res);
	   

}
}
