package lab1;
import java.io.*;
import java.util.*;
public class Area {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	float res,res1,res2,rad,len,wth,sid;
	int choice;
	do {
		System.out.println("MENU");
		System.out.println("1.circle\n2.rectangle\n3.squre\n4.exit");
		System.out.println("Enter your choice:");
		choice=sc.nextInt();
		switch(choice) {
		case 1:
			
				System.out.println("Enter radious value :");
				rad=sc.nextFloat();
				res=(float) ((3.14)*(rad*rad));
						System.out.println("Area of circle is :"+res);
				break;	
				
		case 2:
			System.out.println("Enter length :");
			len=sc.nextFloat();
			System.out.println("Enter width :");
			wth=sc.nextFloat();
			res1=len*wth;
			System.out.println("Area of rectangle is :"+res1);
			break;
			
		case 3:
			System.out.println("Enter the side :");
			sid=sc.nextFloat();
			res2=sid*sid;
			System.out.println("Area of squre :"+res2);
			break;
			
		default:
			System.out.println("worng choice...");
		}
		
	}while(choice !=4); 
}
}
