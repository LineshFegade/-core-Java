package method;

public class OverloadDemo {
public static void main(String[] args) {
	Overload ob=new Overload();
	ob.test();
	ob.test(5);
	ob.test(5.5f);
	ob.test(2.1d);
}	
}
