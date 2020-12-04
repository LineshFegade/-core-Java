/*
 * 4.	WAP to add user defined objects of type Employee in a HashSet. Print the contents in the Set.
 */
package CollectionSet;
import java.util.*;
public class Que3 {
@SuppressWarnings("unchecked")
public static void main(String[] args) {
	HashSet h=new HashSet();
	
	h.add(new Employee(101,"prakash","Devloper",55000));
	h.add(new Employee(106,"anil","Devloper",52000));
	h.add(new Employee(109,"akash","Tester",38000));
	h.add(new Employee(102,"aniket","Tester",40000));
	h.add(new Employee(112,"mandar","Devloper",60000));
	
	
		System.out.println(h);
	
}
}
