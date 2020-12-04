package array;
import java.util.*;
public class Array2d {
	public static void main(String[] args) {
		int [][] a={{10,20,30,40},{50,60},{80,90,100},{50,47,66,85,98 }};
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.print(a[i][j]+",");
			}
			System.out.println();
		}
		
	}
	
}
