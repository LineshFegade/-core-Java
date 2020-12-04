package OOPS;
import java.io.*;
import java.util.*;
public class bonus_10 {
	Scanner sc=new Scanner(System.in);
	float res,res1,sal,year;
	void salary() {
		System.out.println("Enter salary : ");
		sal=sc.nextInt();
	}
	void years() {
		System.out.println("Enter the years : ");
		year=sc.nextInt();
		if(year>=5) {
			res=(sal*5)/100;
			res1=res+sal;
			System.out.println("bonus is :"+res+"Rs");
			System.out.println("After applying bonus "+res+"Rs total salary is "+res1+"Rs" );
		}
		else {
			System.out.println("SORRY....Bonus NOT applicable...");
		}
	}
	public static void main(String[] args) {
		bonus_10 ob=new bonus_10();
		ob.salary();
		ob.years();
	}

}
