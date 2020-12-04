package drawing_poly;
import java.util.*;
public class Square extends Shape{

public void calculateArea () {
		Scanner sc=new Scanner(System.in);
		System.out.println("***Calculate square***");
		System.out.println("Enter side :-");
		float side=sc.nextFloat();
		System.out.println("Area of square is :-"+side*side);
		System.out.println("---------------------------------");
		
	}
}
