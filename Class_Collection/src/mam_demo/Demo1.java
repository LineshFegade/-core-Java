package mam_demo;
import java.util.*;
public class Demo1 {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		//ArrayList countries=new ArrayList();
		//HashSet countries=new HashSet();
		//TreeSet countries=new TreeSet();
		//LinkedHashSet countries=new LinkedHashSet();
		LinkedList<String> countries=new LinkedList<>();
	
		countries.add("India");
		countries.add("Australia");
		countries.add("USA");
		countries.add("UK");
		countries.add("japan");
		countries.add("India");
		
		System.out.println("No of countries="+countries.size());
		System.out.println(countries);		  	 //show the array.
		
		for (Object o:countries) {					// show individual.
			System.out.println(o);			
		}
		
	}
}
