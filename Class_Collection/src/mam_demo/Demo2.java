package mam_demo;
import java.util.*;
public class Demo2 {
	public static void main(String[] args) {
		Stack st=new Stack();
		st.push(10);
		st.push(20);
		st.push("hello");
		st.push(new Product(102,"Realme Mobile",45000));
		
		System.out.println(st);
		
		System.out.println(st.pop());
		System.out.println(st);
		
		System.out.println(st.peek());
		System.out.println(st);
		
	
	}
}
