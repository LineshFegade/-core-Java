package inharitance;
import java.io.*;import java.util.*;
class person{
	//Scanner sc=new Scanner(System.in);
	String name,gender,Address;int age;
	person(String name,String gender,String Address,int age){
		this.name=name;
		this.gender=gender;
		this.Address=Address;
		this.age=age;
	}	
}
class Address extends person{
	String city,state,country;
	
	public Address(String city,String state,String country,person p){
		super(p.name,p.gender,p.Address,p.age);
		this.city=city;
		this.state=state;
		this.country=country;
	}

	
}
public class H_inheritance_8 {
public static void main(String[] args) {
	Address ob=new Address("Ashish","male","badlapur",24,"katrap","maha","india");
}
}
