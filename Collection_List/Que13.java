/*
 * 43.	WAP to join two linked lists.
 */
package Collection_List;
import java.util.*;
public class Que13 {
public static void main(String[] args) {
	LinkedList<String> s=new LinkedList<String>();
	s.add("Red");
	s.add("Green");
	s.add("Blue");
	System.out.println("First List :"+s);
	
	LinkedList<String> t=new LinkedList<String>();
	t.add("Black");
	t.add("Yellow");
	t.add("Orange");
	
	System.out.println("Second List :"+t);
	
	LinkedList<String> a=new LinkedList<String>();
	a.addAll(s);
	a.addAll(t);
	
	System.out.println("Adding Fist and Second list :"+a);
	System.out.println("");
}
}
