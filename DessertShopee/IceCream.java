package DessertShopee;

public class IceCream extends DessertItem{
	private double toppings;
	
	public IceCream() {
		super();
		toppings=8;
	}
	public IceCream(String DessertName,double toppings) {
		super(DessertName);
		this.toppings=toppings;
	}	
	
	@Override
	public double getCost() {
		double result=toppings*5;
		return result;
	}
	@Override
	public void display() {
		System.out.println("Dessert Name : "+super.getDessertName()+"\t\t\tToppings : "+getToppings()+"\t\t\tPrise : "+getCost()+"Rs");
	}
	public double getToppings() {
		return toppings;
	}
	public void setToppings(double toppings) {
		this.toppings = toppings;
	}
	

}
