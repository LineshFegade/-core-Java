/*
 * 1.	WAP to iterate through all elements in a TreeSet.
 */
package CollectionSet;
import java.util.*;
public class que5 {
public static void main(String[] args) {
	TreeSet<String> s=new TreeSet<String>();
	
	s.add("Linesh");
	s.add("Harshal");
	s.add("Mandar");
	s.add("Rahul");
	s.add("Sager");
	
	for(Object o:s) {
		System.out.println(o);
	}
}
}
//TreeSet gives Sorted order.
