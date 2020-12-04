/*
 * 3.	WAP to search an element from ArrayList
 */
package Collection_List;
import java.util.*;
public class Que2 {
public static void main(String[] args) {
	ArrayList<String> ar=new ArrayList<>();
	
	ar.add("Red");
	ar.add("Black");
	ar.add("Green");
	ar.add("Pink");
	ar.add("Blue");
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter colour :-");
	String s=sc.next();
	   if (ar.contains(s)) {
		    System.out.println("Found the element");
		    } else {
		    System.out.println("There is no such element");
		    }
}
}
