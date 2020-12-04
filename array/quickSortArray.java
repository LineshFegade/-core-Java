package array;

public class quickSortArray {
public static void main(String[] args) {
	int[] arr= {15,9,7,13,12,16,4,18,11};
	int length=arr.length;
	 
	quickSortArray qs=new quickSortArray();
	qs.quickSortRecursion(arr, 0, length-1);
	qs.printArray(arr);
	
	
	}
public int partion(int[] arr,int low,int high ) {
	
		int piovt=arr[(low+high)/2];
		while(low<=high) {
			 while(arr[low]<piovt) {
				 low++;
			 }
			 while(arr[high]>piovt) {
				 high--;
			 }
			 if(low<=high) {
				 int temp=arr[low];
				 arr[low]=arr[high];
				 arr[high]=temp;
				 low++;
				 high--;
			 }
		}
		return low;
	}
public void quickSortRecursion(int[] arr,int low,int high) {
	int pi=partion(arr,low,high);
	if(low<pi-1) {
		quickSortRecursion(arr,low,pi-1);				//this recursion for left hand side.
	}
	if(pi<high) {
		quickSortRecursion(arr,pi,high);			//r for right hand side.
	}
}

public void printArray(int arr[]) {
	for(int i:arr) {
		System.out.print(i+",");
	}
}
}
