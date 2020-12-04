/*
 * 10.	WAP to print all elements of ArrayList using iterator
 */
package Collection_List;
import java.util.*;
public class Que8 {
public static void main(String[] args) {
	ArrayList<String> s=new ArrayList<>();
	
	s.add("Harshal");
	s.add("Sager");
	s.add("Mandar");
	s.add("rahul");
	
	Iterator<String> itr=s.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
}
}
