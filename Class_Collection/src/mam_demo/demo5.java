package mam_demo;

import java.util.*;


public class demo5 {
	public static void main(String[] args) {
		//HashSet<Product> hs=new HashSet<>();
		TreeSet<Product> hs=new TreeSet<Product>();
		hs.add(new Product(102, "laptop", 45000));
		hs.add(new Product(101, "ipod", 450));
		hs.add(new Product(104, "power bank", 5000));
		hs.add(new Product(103, "charger", 1500));
		
		for(Object o:hs){
			System.out.println(o);
		}
		
	}
}
