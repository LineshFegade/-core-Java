package inharitance;
class test{
	void T1() {
		System.out.println("First Test..");
	}
}
class test1 extends test{
	void T2() {
		System.out.println("Second Test...");
	}
	
}
class test2 extends test1{
	void F() {
		System.out.println("Final Exam...");
	}
	
}
public class H_Inharitance_2 {
public static void main(String[] args) {
	test2 t=new test2();
	t.T1();
	t.T2();
	t.F();
}
}
