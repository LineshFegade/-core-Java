package itrations;
import java.io.*;
import java.util.*;
public class even_odd_prime {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int choice;
	do {
		System.out.println("MENU :\n 1.EVEN \n 2.ODD NUMBER.\n 3.PRIME NUMBER \n 4.Exits");
	System.out.println("Enter the choice :");
	 choice=sc.nextInt();


    switch(choice) {
	case 1:for(int i=1;i<=100;i++) {
		if(i%2==0) {
	
		System.out.println("even no is :"+i+" ");
	}
	}
	break;
	case 2:for(int i=1;i<=100;i++) {
		if(i%2!=0) {
			System.out.println("odd no is :"+i+" ");
		}
	}
	break;
	case 3:for(int i=1;i<=100;i++) {
		if(i%2!=0) {
			System.out.println("prime no is :"+i+" ");
		}
	}
	break;
	case 4:System.out.println("Thank you....");
	break;
	default:System.out.println("INVALID CHOICES.....");
	}
	}while(choice!=4);	
}
}
