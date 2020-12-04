package lab3;
import java.util.ArrayList;
import java.util.Collections;
public class Friends {
public static void main(String[] args) {
	ArrayList<String> list=new ArrayList<String>();
	list.add("ashish");
	list.add("sager");
	list.add("harshal");
	list.add("praful");
	list.add("prasad");
	list.add("girish");
	list.add("vishal");
	list.add("ashish");
	list.add("vikram");
	list.add("rahul");
	list.add("mandar");
	list.add("ashitosh");
	list.add("nikhil");
	list.add("sachin");
	
	System.out.println("numbers of friend list :-"+list.size());
	Collections.sort(list);
	System.out.println(list);
}
}
