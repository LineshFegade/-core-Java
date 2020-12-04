/*
 * 5.	WAP to retrieve an element (at a specified index) from a given ArrayList
 */
package Collection_List;
import java.util.*;
public class Que4 {
public static void main(String[] args) {
	List<String> cs=new ArrayList<String>();
	cs.add("India");
	cs.add("China");
	cs.add("Japan");
	cs.add("Asutrelia");
	cs.add("America");
	
	System.out.println(cs);
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Index number");
	int in=sc.nextInt();
	
	String ele=cs.get(in);
	System.out.println(" index :"+in+"  country name :"+ele);
	
}
}
