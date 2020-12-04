/*
 * 1.	WAP to add an element at a particular index using Add().
 */
package Collection_List;
import java.util.*;
public class Que1 {
@SuppressWarnings({ "unchecked", "rawtypes" })
public static void main(String[] args) {
	ArrayList ar=new ArrayList();
	
	ar.add(0,"one");
	ar.add(1,"two");
	ar.add(2,"three");
	ar.add(3,"four");
	ar.add(4,"five");
	
	for(Object o:ar) {
		System.out.println(o);
	}
}
}
