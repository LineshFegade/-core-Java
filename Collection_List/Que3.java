/*
 * 4.	WAP to search the specified collection in this collection
 */
package Collection_List;
import java.util.*;
public class Que3 {
public static void main(String[] args) {
	Collection<String> c=new LinkedList<>();
	
	c.add("mumbai");
	c.add("pune");
	c.add("solapur");
	c.add("sangli");
	c.add("akola");
	c.add("jalgaon");
	c.add("nagpur");
	c.add("nashik");
	
		/*
		 * Scanner sc=new Scanner(System.in); System.out.println("Enter city :"); String
		 * city=sc.next();
		 */
	
	boolean result=c.contains("jalgaon");
	
	System.out.println("Jalgaon in the list :-"+result);
}
}
