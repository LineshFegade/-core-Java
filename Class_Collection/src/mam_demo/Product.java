package mam_demo;

public class Product implements Comparable<Product>{
	private int code;
	private String name;
	private double price;
	
	@Override
	public int compareTo(Product p) {
		if(this.code == p.code)
			return 0;
		else if(this.code < p.code)
			return -1;
		else
			return 1;
	}
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(int code, String name, double price) {
		super();
		this.code = code;
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [code=" + code + ", name=" + name + ", price=" + price
				+ "]";
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
}
