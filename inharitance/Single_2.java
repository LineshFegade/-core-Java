package inharitance;
class A{
	int a=5,b=6,res=0;
	void me1() {
		res=a+b;
		System.out.println(res);
		
		 
	}
}
class B extends A{
	
	void me2() {
	super.me1();
	System.out.println("hello inheritance");
	}
}


class Single_2 {
public static void main(String[] args) {
	B ob=new B();
	ob.me2();
}
}
