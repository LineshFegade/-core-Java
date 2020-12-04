package method;

public class Calculator_6 {
	int res=0,res1=0,res2=0,res3=0;
	double add(int i,int j) {
		res=i+j;
		System.out.println("Addition :"+res);
		return res;
	}
	double sub(int i,int j) {
		res1=i-j;
		System.out.println("subtraction :"+res1);
		return res1;
	}
	double mul(int i,int j) {
		res2=i*j;
		System.out.println("Multiplication :"+res2);
		return res2;
	}
	double div(int i,int j) {
		res3=i/j;
		System.out.println("Division :"+res3);
		return res3;
	}
public static void main(String[] args) {
	Calculator_6 ob=new Calculator_6();
	ob.add(6,7);
	ob.sub(7,5);
	ob.mul(4,3);
	ob.div(15,5);
}
}
