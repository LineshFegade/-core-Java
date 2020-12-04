/*Selection Sort:
 * the combination of selecting and sorting,
 * it sort an array by repeatedly finding the minimum elements form unsort part putting at the begining.
 * an every itration of selection sort the minimum elements(ascending order) form unsort subarrayis picked and 
 * move to sorted subarray. 
 */
package array;
import java.util.*;
public class SelectionSortArray {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int min,temp=0;
	System.out.println("Enter size of elements");
	int size=sc.nextInt();
	
	System.out.println("Enter the array elements :-");
	int[] arr=new int[size];
	for (int i = 0; i < arr.length; i++) {
		arr[i]=sc.nextInt();
		}
	
	for(int i=0;i<arr.length;i++)
	{
		min=i;
		for(int j=i+1;j<arr.length;j++) {     // this loop for searching smallest eleemnt
			
			if(arr[j]<arr[min]) {
				min=j;
			}
		}
		temp=arr[i];
		arr[i]=arr[min];
		arr[min]=temp;
	}
	System.out.println("Section sort array elements are :-");
	for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i]+",");
	}
}
}
