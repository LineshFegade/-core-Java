package method;

public class Calculator {
	int sum,diffrance;
	int calculateSum(int num1,int num2) {
		sum=num1+num2;
		System.out.println("sum is :"+sum);
		return sum;
	}
	int calculateDifference(int num1,int num2) {
		diffrance=num1-num2;
		System.out.println("diffrance is :"+diffrance);
		return diffrance;
	}
public static void main(String[] args) {
	Calculator ob=new Calculator();
	ob.calculateSum(5,5);
	ob.calculateDifference(8,4);
}
}
