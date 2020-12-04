package Collection_List;
import java.util.*;
public class Que11 {
public static void main(String[] args) {
	LinkedList<String> l=new LinkedList<String>();
	l.add("Red");
	l.add("Blue");
	l.add("Green");
	l.add("White");
	l.add("Black");
	l.add("Ornage");
	l.add("cyan");
	
	System.out.println(l);
	System.out.println("Enter any color :");
	Scanner sc=new Scanner(System.in);
	String clr=sc.next();
	if(l.contains(clr)) {
		System.out.println("Font the elements");
	}
	else {
		System.out.println("Can Not Find elements");
	}
}
}
