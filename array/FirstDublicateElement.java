package array;
import java.util.*;
public class FirstDublicateElement {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter size of elements :-");
	int size=sc.nextInt();
	int[] arr=new int[size];
	System.out.println("enter array elements :-");
	for(int i=0;i<arr.length;i++) {
		arr[i]=sc.nextInt();
	}
	for(int i=0;i<arr.length-1;i++) {
		int temp=0;
		for(int j=i+1;j<arr.length;j++) {
			if((arr[i]==arr[j])&& (i!=j)) {
				System.out.println("First Dublicate Elements :-"+arr[j]);
				temp+=1;
				break;
			}
		}
		if(temp>0) {
			break;
		}
	}
}
}
