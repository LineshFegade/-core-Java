/*
 * WAP to create a HashSet with Integer objects without using generics
 */
package CollectionSet;
import java.util.*;
public class Que6 {
public static void main(String[] args) {
	HashSet<Integer> h=new HashSet<>();
	
	h.add(15);
	h.add(1);
	h.add(12);
	h.add(2);
	h.add(7);
	
	System.out.println(h);
}
}
