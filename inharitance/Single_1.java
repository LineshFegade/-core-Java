package inharitance;

class parents{
    void m1() {
    	System.out.println("parent class method 1");
    }
}
class childs extends parent{
	void c1() {
		System.out.println("Childern cls method 1");
	}
	
}



class main_1{
	public static void main(String []args) {
		childs ob=new childs();
		ob.m1();
		ob.c1();
		

}
}
