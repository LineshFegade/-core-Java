/*
 * 9.	WAP to use add operation of ArrayList
 */
package Collection_List;
import java.util.*;
public class Que7 {
	public static void main(String[] args) {
		LinkedList<String> lk=new LinkedList<>();
		lk.add("red");
		lk.add("blue");
		lk.add("Green");
		
		System.out.println("Befor adding list :-"+lk);
		
		lk.add("Black");
		lk.add("sky Blue");
		System.out.println("After adding element :-"+lk);
	}
}
