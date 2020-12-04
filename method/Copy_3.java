package method;

public class Copy_3 {
	
	int a=10;
	void m1() {
		System.out.println(a);
	}
public static void main(String[] args) {
	Copy_3 ob=new Copy_3();
ob.m1();
	
	
	Copy_3 ob1=new Copy_3();
	ob1=ob;
	System.out.println(ob1.a);
}
}
