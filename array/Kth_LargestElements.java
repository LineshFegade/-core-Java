package array;
import java.util.*;
public class Kth_LargestElements {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter size of arrays :-");
	int size=sc.nextInt();
	int[] arr=new int[size];
	int temp;
	//int k=4;
	System.out.println("Enter kth position elements :-");
	int k=sc.nextInt();
	System.out.println("Enter arrays Elements :-");
	for(int i=0;i<arr.length;i++) {
		arr[i]=sc.nextInt();
	}
	for(int i=0;i<arr.length-1;i++) {
		for(int j=i+1;j<arr.length;j++) {
			temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}
		if(i==k-1) {
			System.out.println("Kth Lagest elements :-"+arr[i]);
				break;
		}
	}
		
}
}
