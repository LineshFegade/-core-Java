	/*
	 * 46.	WAP to retrieve but does not remove, the last element of a linked list.
	 */
package Collection_List;
import java.util.*;
public class Que15 {
	public static void main(String[] args) {
		LinkedList<String> l=new LinkedList<String>();
		l.add("yellow");
		l.add("blue");
		l.add("Black");
		l.add("White");
		System.out.println("original list :"+l);
		
		String x=l.peekLast();
		System.out.println("last element :"+x);
		System.out.println("original linked list :"+l);
	}
	}

