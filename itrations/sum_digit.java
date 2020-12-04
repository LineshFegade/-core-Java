package itrations;
import java.io.*;
import java.util.*;

public class sum_digit {
 public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int sum=0;
	int c;
	System.out.println("Enter the number :");
	int n=sc.nextInt();
	while(n>0) {
		c=n%10;
		sum+=c;
		n=n/10;
	
	}
	System.out.println("sum of DIGIT :"+sum);
}}
