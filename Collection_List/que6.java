/*
 * 8.	WAP to set or replace an element using set().
 */
package Collection_List;
import java.util.*;
public class que6 {
public static void main(String[] args) {
	ArrayList <String> a=new ArrayList<>();
	a.add("India");
	a.add("China");
	a.add("Japan");
	a.add("Asutrelia");
	a.add("America");
	
	System.out.println("Befor opration :-"+a);
	
	String i=a.set(2,"singapur");
	System.out.println("Repalce:"+a+" ");
}
}
