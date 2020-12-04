package constructor_j23;

public class Demo {
	Demo(){
		this(5);
		System.out.println("Deault constructor");
	}
	Demo(int a){
		this("C");
		System.out.println("Int Constructor  "+a);
	}
	Demo(String b){
		System.out.println("String Consructor  "+b);
	}
	
public static void main(String[] args) {
	//Demo D=new Demo();
	//Demo D1=new Demo(5);
	Demo D2=new Demo("D");
	
}
}
