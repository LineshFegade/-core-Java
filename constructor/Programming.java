/*7.	Create a class named 'Programming'. While creating an object of the class, 
    if nothing is passed to it, then the message "I love programming languages" should be printed. 
    If some String is passed to it, then in place of "programming languages" the name of that String variable should be printed.
    For example, while creating object if we pass "Java", then "I love Java" should be printed.*/

package constructor;

public class Programming {
		Programming(){
			System.out.println("I Love programming");
		}
		Programming(String s){
			System.out.println("i love "+s);
		}
public static void main(String[] args) {
	Programming pro=new Programming();
	Programming pr=new Programming("java ");
	
}
}
