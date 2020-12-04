package GenricsCollection;
import java.io.ObjectInputStream.GetField;
import java.util.*;
public class BooksObj {
public static void main(String[] args) {
	TreeSet<Books> tr=new TreeSet<>();
	
	tr.add(new Books(101,"The Great Gatsby. ...",750));
	tr.add(new Books(105,"One Hundred Years of Solitude. ...",350));
	tr.add(new Books(102,"Invisible Man. ...",600));
	tr.add(new Books(109,"Something i never told you...",500));
	tr.add(new Books(120,"Believe in Your self..",190));
	
	//System.out.println(tr.getClass());
	
	System.out.println(tr);
}
}
