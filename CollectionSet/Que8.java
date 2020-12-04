/*
 * 4.	WAP to iterate through all elements in a HashSet and print the elements. Observe the order of elements.
 */
package CollectionSet;
import java.util.*;
public class Que8 {
public static void main(String[] args) {
	HashSet<String> s=new HashSet<String>();
	s.add("red");
	s.add("green");
	s.add("blue");
	s.add("orange");
	s.add("black");
	s.add("white");
	
	Iterator<String> p = s.iterator();
	while(p.hasNext()) {
		System.out.println(p.next());
	}
}
}
