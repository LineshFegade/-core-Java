package array;

public class margeSort {
	int[] array;
	int[] tempMargearr;
	int length;
	
	public static void main(String[] args) {
		int[] inputarr= {48,36,13,52,19,94,21};
		margeSort ma=new margeSort ();
		ma.sort(inputarr);
		for(int i:inputarr) {
			System.out.print(i+",");
		}
	}
	public void sort(int inputarr[]) {
		this.array=inputarr;
		this.length=inputarr.length;
		this.tempMargearr=new int[length];		//temp araay create.
		divideArray(0,length-1) ;
	}
	public void divideArray(int lowerIndex,int higherIndex) {
		if(lowerIndex<higherIndex) {
			int middle=lowerIndex+(higherIndex-lowerIndex)/2;
			divideArray(lowerIndex, middle);			//it will sort the left side of an array.
			divideArray(middle+1, higherIndex);         //it wil sort the right side of array.
			margeArray( lowerIndex, middle, higherIndex);
		}
	}
	public void margeArray(int lowerIndex,int middle,int higherIndex) {
		for(int i=lowerIndex;i<=higherIndex;i++) {
			tempMargearr[i]=array[i];
		}
		int i=lowerIndex;
		int j=middle+1;
		int k=lowerIndex;
		
		while(i<=middle && j<=higherIndex) {
			if(tempMargearr[i]<=tempMargearr[j]) {
				array[k]=tempMargearr[i];
				i++;
			}
			else {
				array[k]=tempMargearr[j];
				j++;
			}
			k++;
			
		}
		while(i<=middle) {
			array[k]=tempMargearr[i];
			k++;
			i++;
		}
	}
}

