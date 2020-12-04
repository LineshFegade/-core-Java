/*
 * WAP to create a HashSet from an ArrayList
 */
package CollectionSet;
import java.util.*;
public class Que7 {
public static void main(String[] args) {
	HashSet<String> s=new HashSet<String>();
	s.add("Red");
	s.add("yellow");
	s.add("blue");
	s.add("orange");
	s.add("green");
	s.add("cyan");
	s.add("black");
	
	System.out.println("Haset contains :     "+s);
	
	List<String> h=new ArrayList<>(s);
	System.out.println("ArrayList Contains :"+h);
}
}
