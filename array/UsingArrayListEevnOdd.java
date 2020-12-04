package array;
import java.util.*;
public class UsingArrayListEevnOdd {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter size of elements :-");
	int size=sc.nextInt();
	int[] arr=new int[size];
	System.out.println("enter array elements :-");
	for(int i=0;i<arr.length;i++) {
		arr[i]=sc.nextInt();
	}
	ArrayList<Integer> a1=new ArrayList<Integer>();
	ArrayList<Integer> a2=new ArrayList<Integer>();
	
	for(int i=0;i<arr.length;i++) {
		if(arr[i]%2==0) {
			a1.add(arr[i]);
		}
		else {
			a2.add(arr[i]);
		}
	}
	int total1=0,total2=0;
	System.out.println("Even Number is:-");
		for(int no:a1) {
			total1+=no;
			System.out.println(no+"  ");
		}
		System.out.println("\n");
		System.out.println("total no is even no :-"+a1.size());
		System.out.println("sum of all even number :-"+total1);
		System.out.println("-------------------------------------------------------------------");
		System.out.println("odd number is :- ");
		for(int no:a2) {
			total2+=no;
			System.out.println(no+ "   ");
		}
		System.out.println("total no is even no :-"+a2.size());
		System.out.println("sum of all even number :-"+total2);
}
}
