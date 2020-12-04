package inharitance;

class Super{
	void a1(){
		System.out.println("this is super class");
	}
}

 class parent extends Super{
	public parent() {
		// TODO Auto-generated constructor stub
	}

	void m1() {
		System.out.println("This is parents class method m1");
	}
}


 class Demo extends Super{
	
	 void m2(){
		System.out.println("This is child class");
	 }
	
}
 
 class main extends parent{
	 public static void main(String[] args) {
		 Demo ob=new Demo();
		 parent ob1=new parent();
		
	 }
 }