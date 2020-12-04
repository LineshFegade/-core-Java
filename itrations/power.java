package itrations;
import java.io.*;
import java.util.*;

public class power {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter base number :");
	int base=sc.nextInt();
	int result=1;
	
	 System.out.println("Enter power number :");
	 int power=sc.nextInt();
	while(power>0) {
		result*=base;
		power--;
	}
	 System.out.println("value of enter power is :"+result);
	 }
}
