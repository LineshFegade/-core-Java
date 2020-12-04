package drawing_poly;
import java.util.*;
public class Rectangle extends Shape{
	
public void calculateArea () {
		Scanner sc=new Scanner(System.in);
		System.out.println("***Calculate Rectangle***");
		System.out.println("Enter length :-");
		float length=sc.nextFloat();
		System.out.println("Enter width:-");
		float width=sc.nextFloat();
		float res=length*width;
		System.out.println("Area of rectangle is :-"+res);
		System.out.println("---------------------------------");
	}
}
