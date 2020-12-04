package inharitance;
class BaBa{
	int age;String name;
	BaBa(int age,String name){
		this.age=age;
		this.name=name;
	}
	void pa() {
		System.out.println(age+" "+name);
	}
}
class ashu extends BaBa{
	int age;String name;
	ashu(int age,String name){
		super(24,"Linesh");
		this.age=age;
		this.name=name;
	}
	void aa() {
		System.out.println(age+" "+name);
	}
}
class aai extends BaBa{
	int age;String name;
	aai(int age,String name){
		super(51,"Anant");
		this.age=age;
		this.name=name;
	}
	void Aa() {
		System.out.println(age+" "+name );
	}
	
}
public class H_Inheritance_3 {
public static void main(String[] args) {
	aai ob=new aai(45,"grishma");
	ashu o=new ashu(23,"aashu");
	ob.Aa();
	ob.pa();
	
	o.aa();
	o.pa();
}
}
