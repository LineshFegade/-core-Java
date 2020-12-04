/*
 * 6.	WAP to print all the elements of an ArrayList using the position of the elements
 */
package Collection_List;
import java.util.*;
public class que5 {
public static void main(String[] args) {
	ArrayList<String> st=new ArrayList<>();
	
	st.add("India");
	st.add("China");
	st.add("Japan");
	st.add("Asutrelia");
	st.add("America");
	
	System.out.println("index wise contry :");
	for(Object o:st) {
		System.out.println(o);
	}
}
}
