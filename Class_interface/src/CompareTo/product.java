package CompareTo;

public class product implements  Comparable<product> {
	private int code;
	private String productName;
	private long price;
	
	public product() {
		code=90567;
		productName="Ac";
		price=25000;
	}
	public product(int code,String productName,long price) {
		this.code=code;
		this.productName=productName;
		this.price=price;
		
	}
	
	@Override
	public String toString() {
		return "product [code=" + code + ", productName=" + productName + ", price=" + price + "]";
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public long getPrice() {
		return price;
	}
	public void setPrice(long price) {
		this.price = price;
	}
	@Override
	public int compareTo(product o) {
		if(this.getPrice()== o.getPrice()) {
			return 0;
		}
		else if(this.getPrice()< o.getPrice()) {
			return -1;
		}
		else {
			return 1;
		}
	}
	
	
}
