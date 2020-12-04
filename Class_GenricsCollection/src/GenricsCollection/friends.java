package GenricsCollection;
import java.util.*;
public class friends {
public static void main(String[] args) {
	ArrayList<String> ar=new ArrayList<>();
	
	ar.add("Mandar");
	ar.add("Rahul");
	ar.add("Sager");
	ar.add("Ashish");
	ar.add("Girish");
	ar.add("Praful");
	
	Collections.sort(ar);
	System.out.print(ar);
}
}
