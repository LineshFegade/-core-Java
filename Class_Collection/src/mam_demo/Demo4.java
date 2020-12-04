package mam_demo;
import java.util.*;
public class Demo4 {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		//HashMap hm=new HashMap();
		TreeMap hm=new TreeMap();
		hm.put(102, "laptop");
		hm.put(104, "wallet");
		hm.put(101, "choclate box");
		hm.put(103, "power bank");
		hm.put(105, "ipod");
		hm.put(101, "icecream");
		
		System.out.println(hm);
		
		System.out.println("Key are as follows");
		for(Object o:hm.keySet()){
			System.out.println(o);
		}
		
}
}
