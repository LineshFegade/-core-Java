package DessertShopee;

public abstract class DessertItem {
	private String DessertName;
	
	public DessertItem() {
		DessertName="Chocolate";
	}
	public DessertItem(String DessertName) {
		this.DessertName=DessertName;
	}
	
	  static { 
	  System.out.println("Welcome to Dessert Shope");
	  System.out.println("----------------------------");
	  System.out.println("\t\t\t\t\t****Desert Bill****\n");
	  }
	 
	 
	
	public String getDessertName() {
		return DessertName;
	}
	public void setDessertName(String dessertName) {
		DessertName = dessertName;
	}
	
	public abstract double getCost();
	public void display() {}
	
}
