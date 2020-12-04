/*
 * 12.	WAP to iterate a linked list in reverse order.
 */
package Collection_List;
import java.util.*;
public class que9 {
	public static void main(String[] args) {
		LinkedList<String> l=new LinkedList<>();
		l.add("Harshal");
		l.add("Sager");
		l.add("Mandar");
		l.add("rahul");
		//reverse list using iterator.	
		Iterator<String> itr=l.descendingIterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
