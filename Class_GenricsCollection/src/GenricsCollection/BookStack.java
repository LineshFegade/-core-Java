package GenricsCollection;

import java.util.*;

public class BookStack {
public static void main(String[] args) {
	Stack<String> st=new Stack<String>();
	
	st.push("The Great Gatsby. ...");
	st.push("One Hundred Years of Solitude. ...");
	st.push("A Passage to India. ...");
	st.push("Invisible Man. ...");
	st.push("Life is what you make it...");
	st.push("Something i never told you...");
	st.push("Believe in Your self..");
	st.push("The power of Positive Thinking...");
	
	System.out.println("First Pop :-"+st.pop());
	System.out.println("Second pop :-"+st.pop());
}
}
