package drawing_poly;
import java.util.*;
public class Circle extends Shape{
		
	public void calculateArea () {
		Scanner sc=new Scanner(System.in);
		System.out.println("***Calculate Circle***");
		System.out.println("Enter radious :-");
		float radious=sc.nextFloat();
		float pi=3.14f;
		float res=pi*radious*radious;
		System.out.println("Area of circle is :-"+res);
		System.out.println("---------------------------------");
	}
}
