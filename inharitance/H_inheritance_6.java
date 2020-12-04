package inharitance;

class kids{
	void readBook() {
		System.out.println("Java");
	}
	void readBook(int a,int b) {
		System.out.println("First Class..");
		System.out.println(a+" "+b);
	}
	
}
class Bigkid extends kids{
	void readBook() {
		System.out.println("i love java");
	}
	void readBook(int a,int b) {
		System.out.println("Second Class..");
		System.out.println(a+" "+b);
	}
}
public class H_inheritance_6 {
public static void main(String[] args) {
	Bigkid ob=new Bigkid();
	ob.readBook();
	ob.readBook(7,5);
}
}
