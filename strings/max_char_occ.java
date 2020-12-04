package strings;

public class max_char_occ {
public static void main(String[] args) {
	String s="abbbbccc";
	int[] arr=new int[255];//array for ascii value.
	for(int i=0;i<=s.length()-1;i++) {
		arr[s.charAt(i)]=arr[s.charAt(i)]+1;//ascii value wise check who many time char are come ad addes 1 in that place
	}
	int max=0;
	char c=' ';
	for(int i=0;i<s.length();i++) {
		if(max<arr[s.charAt(i)]) {
			max=arr[s.charAt(i)];
			c=s.charAt(i);
		}
	}
	System.out.println("repeted char is :-"+c);
}
}
