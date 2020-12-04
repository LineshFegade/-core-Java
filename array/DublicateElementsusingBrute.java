package array;
import java.util.*;
public class DublicateElementsusingBrute {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter size of arrays :-");
	int size=sc.nextInt();
	int[] arr=new int[size];
	System.out.println("Enter arrays Elements :-");
	for(int i=0;i<arr.length;i++) {
		arr[i]=sc.nextInt();
	}
	System.out.println("dublicate elements are :-");
	for(int i=0;i<arr.length;i++) {
		for(int j=i+1;j<arr.length;j++) {
			if((arr[i]==arr[j])&&(i!=j)) {
				System.out.print(arr[j]+" ,");
			}
		}
	}
}
}
