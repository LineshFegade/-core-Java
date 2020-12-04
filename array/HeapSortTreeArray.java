package array;

public class HeapSortTreeArray {
public static void main(String[] args) {
	int[] arr= {22,13,17,11,10,14,12};
	HeapSortTreeArray hs=new HeapSortTreeArray();
	hs.sort(arr);
	hs.printArray(arr);
}
public void sort(int[] arr) {
	int length=arr.length;
	for(int i=length/2-1;i>=0;i--) {
		heapif(arr,length,i);
	}
	//swap the elements and heapif again.
	for(int i=length-1;i>=0;i--) {
		int temp=arr[0];
		arr[0]=arr[i];
		arr[i]=temp;
		heapif(arr,i,0);
	}
}
public void heapif(int[] arr,int n,int i ) {
	int largest=i;  	//	 parent node index position.(i)
	int li=2*i+1;	   // left child node index position.
	int ri=2*i+2;	  //right child node index position.
	if(li< n && arr[li]>arr[largest]) {
		largest=li;
	}
	if(ri < n && arr[ri]>arr[largest]) {
		largest=ri;
	}
	if(largest !=i) {
		 int temp=arr[i];
		 arr[i]=arr[largest];
		 arr[largest]=temp;
		 heapif(arr,n,largest);
	}
}
public void printArray(int[] arr) {
	for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i]+",");
	}
}
}
