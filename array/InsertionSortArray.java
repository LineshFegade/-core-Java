/*insertion sort
 * here in insertion sorting all array are in ascending order.
 * 1,2,3,4,5,6,7,8,9,10,...........etc.
 */
package array;
import java.util.*;
public class InsertionSortArray {
	static Scanner sc=new Scanner(System.in);
public static void main(String[] args) {
	int temp,j;
	System.out.println("Enter Size of element");
	int size=sc.nextInt();
	System.out.print("Enter elements of array :- ");
	int[] arr=new int[size];
	
	for (int i = 0; i < arr.length; i++) {
		arr[i]=sc.nextInt();
	}
	
	for(int i=1;i<arr.length;i++) {
		temp=arr[i];
		j=i;
		while(j>0 && arr[j-1]>temp) {
			arr[j]=arr[j-1];
			j=j-1;
		}
		arr[j]=temp;
	}
	System.out.println("Insertions sort list:-");
	for (int i = 0; i < arr.length; i++) {
		System.out.print(arr[i]+",");
	}
}
}
