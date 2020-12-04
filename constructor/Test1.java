package constructor;

public class Test1 {
	Test1(){
		System.out.println("1ST constructor");
	}
	Test1(int a){
		System.out.println("2nd constructor  "+a);
	}
	Test1(float a){
		System.out.println("3rd constructor  "+a);
	}
	Test1(char a){
		System.out.println("4th Constructor  "+a);
	}
public static void main(String[] args) {
	Test1 ob=new Test1();
	Test1 ob1=new Test1(6);
	Test1 ob2=new Test1(7.7f);
	Test1 ob3=new Test1('D');
}
}