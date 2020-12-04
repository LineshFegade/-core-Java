package array;
import java.util.*;

public class RevArray {
	Scanner sc=new Scanner(System.in);
	void reverseArray() {
		System.out.println("Enter the Array Size :-");
		int size=sc.nextInt();
		int[] arr=new int[size];
		System.out.println("Enter the array element:-");
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("the  Reverse Array Element are:-");
		for (int i = arr.length-1; i>=0; i--) {
			System.out.println(arr[i]);
		}		
	}
	void MinMax() {
		System.out.println("Enter the Array Size :-");
		int size=sc.nextInt();
		int[] arr=new int[size];
		int min=arr[0],max=0;
		System.out.println("Enter the array element:-");
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		for (int i = 1; i < arr.length; i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		System.out.println("Minimum number in Arry is :-"+min);
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		System.out.println("Maximum number in Arry is :-"+max);
	}
	void EvenArray() {
		System.out.println("Enter the Array Size :-");
		int size=sc.nextInt();
		int[] arr=new int[size];
		System.out.println("Enter the array element:-");
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]%2==0) {
				System.out.println("Even Number  :-"+arr[i]);			
			}
		}	
	}
	void CarBrand() {
		String[] car= {"Honda","BMW","Lamborghini","Benttly","Toyota","Tesla"};
		Arrays.sort(car);
		System.out.println("The Car Brand Are:-");
		for(String s:car) {
			System.out.println(s);
		}		
	}	
public static void main(String[] args) {
		RevArray ob=new RevArray();
		ob.reverseArray();
		ob.MinMax();
		ob.EvenArray();
		ob.CarBrand();
}
}
