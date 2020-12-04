package lab1;
import java.io.*;
import java.util.*;
public class Persentage {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int eng,math,phy,chem,comp,total,per;
	System.out.println("Enter English paper mark :");
	eng=sc.nextInt();
	System.out.println("Enter Mathematic paper mark :");
	math=sc.nextInt();
	System.out.println("Enter Physics paper mark :");
	phy=sc.nextInt();
	System.out.println("Enter Chemistry paper mark :");
	chem=sc.nextInt();
	System.out.println("Enter Computer paper mark :");
	comp=sc.nextInt();
	 total=eng+math+phy+chem+comp;
	 per=(total*100)/500;
	 
	 System.out.println("Total marks :"+total);
	 System.out.println("Persentag is :"+per);
	 

	 if(per>=90) {
		 System.out.println("Grade A");
	 }
	 else if(per>=80) {
		 System.out.println("Grade B");
	 }
	 else if(per>=70) {
		 System.out.println("grade C");
	 }
	 else if(per>=60) {
		 System.out.println("Grade D");
	 }
	 else if(per>=50) {
		 System.out.println("Grade E");
	 }
	 else if(per>=40) {
		 System.out.println("Grade F");
	 }
	 else {
		 System.out.println("Fail..");
	 }
	 
	
}
}
