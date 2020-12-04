/*
 * 1.	WAP to shuffle the elements in a linked list.
 */
package Collection_List;
import java.util.*;
public class Que12 {
public static void main(String[] args) {
	LinkedList <String> l_list = new LinkedList <String> ();
	 
	  l_list.add("Red");
	  l_list.add("Green");
	  l_list.add("Black");
	  l_list.add("Pink");
	  l_list.add("orange");
	  System.out.println("Linked list before shuffling:\n" + l_list);  
	  Collections.shuffle(l_list);
	  System.out.println("Linked list after shuffling:\n" + l_list); 
}
}
