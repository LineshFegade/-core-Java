package constructor;

/*8.	Create a class Student with int id and String name as member variables.
 *  Generate getter and setter methods for id and name. Observe in the generated setter 
 *  method how the parameter’s value is assigned to the member variable using this keyword.
 *   What would happen in the setter method if you remove ‘this.’ when assigning the parameter value?
o	In main create 2 objects of Student. Set id of first student to 11 and 21 to the other student’s id. Check 
and observe if you can use ‘this’ in main method.

*/
public class Student_get_set_8 {
	int id;
	String name;
	public int getId() {
		return id;
	}

	public void setId(int id) {
		id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		name = name;
	}


	public static void main(String[] args) {
		Student_get_set_8 ob=new Student_get_set_8();
		ob.setId(11);
		ob.setName("linesh");
		ob.setId(21);
		
		System.out.println(ob.getId());
		System.out.println(ob.getName());
	}
}
