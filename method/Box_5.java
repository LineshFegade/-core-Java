package method;
import java.io.*;
import java.util.*;
public class Box_5 {
	Scanner sc=new Scanner(System.in);
	int hight,width,depth;
	void calculator() {
		System.out.println("Enter box hight width and depth :");
		hight=sc.nextInt();
		width=sc.nextInt();
		depth=sc.nextInt();
		System.out.println("Area of BOX is ="+(hight*width*depth));
	}
	public static void main(String[] args) {
		Box_5 ob=new Box_5();
		ob.calculator();
	}

}
