package array;
import java.util.*;
public class SecondLargest_SecondSmallest {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter size of array :-");
	int size=sc.nextInt();
	int[] a=new int[size];
	int temp;
	System.out.println("Enter array elements :-");
	for(int i=0;i<a.length;i++) {
		a[i]=sc.nextInt();
	}
	for(int i=0;i<a.length;i++) {
		for(int j=i+1;j<a.length;j++) {
			if(a[i]<a[j]) {						//  < for highest , >for lowest
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
		if(i==1) {
			break;
		}
	}
	System.out.println("second Highest number :-"+a[1]);
	
	
}
}
