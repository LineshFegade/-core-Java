package inharitance;
import java.util.*;
import java.io.*;


class baba{
	Scanner sc=new Scanner(System.in);
	int a,b,res;
	void Baba() {
		System.out.println("Enter 2 number :");
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("addition is :"+(a+b));
		System.out.println("subtraction is :"+(a-b));
		System.out.println("multiplications is :"+(a*b));
		System.out.println("divison is :"+(a/b));

	}
}
class Aai extends baba{
	void ai() {
		System.out.println("second class");
		System.out.println(super.b*super.a);
	}
}
class Single_3 {
public static void main(String[] args) {
	Aai ob=new Aai();
	ob.Baba();
	ob.ai();
}
}
