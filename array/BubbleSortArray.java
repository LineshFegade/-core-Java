/*Bubble sort:
 * its check left to right 2 elements.
*/
package array;
import java.util.*;
public class BubbleSortArray {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int temp;
	System.out.println("How much array size :-");
	int size=sc.nextInt();
	int[] arr=new int[size];
	System.out.println("Enter the array element:-");        //scanner input values.
	for (int i = 0; i < arr.length; i++) {
		arr[i]=sc.nextInt();
	}
	// buuble sorted logic.
	for(int i=0;i<arr.length;i++) {   					//this for loop for number of rounds.
		int flag=0;
		for(int j=0;j<arr.length-1-i;j++) {				//this loop for adjuesent elements.
			if(arr[j]>arr[j+1]) {
				temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
				flag=1;
			}
		}
		if(flag==0) {
			break;
		}
		 
	}
	System.out.println("Bubble sorted list :-");
	for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i]+" ,");
	}
}
}
