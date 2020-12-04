package inharitance;
class AB{
	void a() {
		System.out.println("This is a parents Class....");
	}
}
class BA extends AB{
	void b() {
		System.out.println("This is Child Class...");
	}
}
public class H_Inharitance_1 {
	public static void main(String[] args) {
		AB ob=new AB();
		BA ob1=new BA();
		ob.a();
		ob1.b();
		ob1.b();
		
	}

}
