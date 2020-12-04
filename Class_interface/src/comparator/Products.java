package comparator;

public class Products {
	private int code;
	private String productName;
	private long price;
	
	public Products() {
		super();
		code=1234;
		productName="AC";
		price=28000;
	}
	public Products(int code,String productName,long price) {
		super();
		this.code=code;
		this.productName=productName;
		this.price=price;
		
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
	public String toString() {
		return "products [code=" + code + ", productName=" + productName + ", price=" + price + "]";
	}
	
	
}
