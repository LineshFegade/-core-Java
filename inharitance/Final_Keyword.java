package inharitance;

import java.util.Scanner;
/*final class CC{
	void Fi() {
		int a=10,b=3;
		System.out.println("parent class method");
		System.out.println(a+b);
	}
}*/
public class Final_Keyword  {    //final class naver extend any value or paramenter
	final int a=1440;
	void F() {
		System.out.println("method 1 without parameter");
		System.out.println(a);    //here final value are print
		//int x=a++;
		//System.out.println(x);   //But here final value naver change.its fixed one time.
	}
	final void Fi() {        //final class.
		int a=10,B=3;
		
		System.out.println(a+B);
	}
	void Fi(int a) {
		System.out.println(a);    //final method are overloaded but parameter value change.
	}
	public static void main(String[] args) {
	
		Final_Keyword	ob=new Final_Keyword();
		ob.F();
		ob.Fi();
		ob.Fi(7);
		//ob.Fi();
	}
}
//final un-initialize final variable are initialize only useing by constructor.