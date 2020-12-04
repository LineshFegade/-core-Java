/*5.	Create a class named 'Rectangle' with two data members- length and breadth and a method to calculate the area which is 'length*breadth'. The class has three constructors which are: 
   1 having no parameter - values of both length and breadth are assigned zero.
   2 Having two numbers as parameters - the two numbers are assigned as length and breadth respectively.
   3 Having one number as parameter - both length and breadth are assigned that number.
Now, create objects of the 'Rectangle' class having none, one and two parameters and print their areas.*/

package constructor;
import java.io.*;
import java.util.*;
public class Rectangle {
	int length,breadth ;
			Rectangle(){
				int length=20,breadth=10;
				System.out.println("1st constructor rectangle value is -->"+(length*breadth));
				
			}
			Rectangle(int a,int b){
				System.out.println("2nd constructor rectangle value is-->"+(a*b));
			}
			Rectangle(int a){
				length=a;
				breadth=a;
				System.out.println("3rd constructor rectngle value is-->"+(length*breadth));
			}
	public static void main(String[] args) {
		Rectangle ob=new Rectangle();
		Rectangle ob1=new Rectangle(4,5);
		Rectangle ob2=new Rectangle(5);
	}
}
