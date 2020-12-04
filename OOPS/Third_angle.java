package OOPS;
import java.io.*;
import java.util.*;

public class Third_angle {
	Scanner sc=new Scanner(System.in);
	int a,b,res=0;	
		void find() {
			System.out.println("Enter the TWO angle :");
			a=sc.nextInt();
			b=sc.nextInt();
			res=180-(a+b);
			System.out.println("third angle :"+res);
		}
	
	
	
	public static void main(String[] args) {
		Third_angle ob=new Third_angle();
		ob.find();
	
}
}
