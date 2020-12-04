package array;
import java.util.*;
public class Array1D {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter size of array :-");
	int size=sc.nextInt();
	int[] arr=new int[size];
	System.out.println("Enter elements of array :-");
	for(int i=0;i<arr.length;i++) {
		 arr[i]=sc.nextInt();
	}
	System.out.println("Array elements:-");
	for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i]+",");
	}	
}
}
