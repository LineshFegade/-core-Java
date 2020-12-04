/*
 * 13.	WAP to insert the specified element at the specified position in the linked list.
 */
package Collection_List;
import java.util.*;
public class Que10 {
public static void main(String[] args) {
	 LinkedList<String> li=new LinkedList<String>();
	    li.add("Red");
		li.add("Black");
		li.add("Green");
		li.add("Pink");
		li.add("Blue");
		
		for(Object o:li) {
			System.out.println(o);
		}
		li.add(3, "voilate");
		li.add(6, "orange");
		System.out.println("After adding color :-  "+li);
}
}
