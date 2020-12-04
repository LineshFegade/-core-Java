package lab2;

import java.util.Stack;

public class book {
@SuppressWarnings({ "rawtypes", "unchecked" })
public static void main(String[] args) {
		Stack s1=new Stack();
		
		s1.push("The Great Gatsby. ...");
		s1.push("One Hundred Years of Solitude. ...");
		s1.push("A Passage to India. ...");
		s1.push("Invisible Man. ...");
		s1.push("Life is what you make it...");
		s1.push("Something i never told you...");
		s1.push("Believe in Your self..");
		s1.push("The power of Positive Thinking...");
		
		System.out.println("number od bokks :"+s1.size());
		
	
		System.out.println("pop first book :-"+s1.pop());
		System.out.println("pop Second book :-"+s1.pop());
}
}
