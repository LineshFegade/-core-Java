package mam_demo;
import java.util.*;
public class demo6 {
	@SuppressWarnings({ "unchecked", "resource", "rawtypes" })
	public static void main(String[] args) {
		Hashtable h=new Hashtable();
		h.put(101, new EmployeeInfo(101,"aaa",89000));
		h.put(102, new EmployeeInfo(102,"bbb",78000));
		h.put(103, new EmployeeInfo(103,"ccc",45000));
		h.put(104, new EmployeeInfo(104,"ddd",23000));
		h.put(105, new EmployeeInfo(105,"eee",95000));
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Employee Id=");
		int eid=sc.nextInt();
		EmployeeInfo einfo=(EmployeeInfo) h.get(eid);
		
		System.out.println(einfo.getEmpName());
		System.out.println(einfo.getSalary());
		System.out.println(einfo.getEmpId());
		
		
	}
}
