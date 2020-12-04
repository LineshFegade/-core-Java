package DessertShopee;

public class Candy extends DessertItem{
	private double weight;
	
	public Candy() {
		super();
		weight= 850d;
	}
	
	public Candy(String DessertName,double weight) {
		super(DessertName);
		this.weight=weight;
	}	
	
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	@Override
	public double getCost() {
		double	result=(weight*100)/1000;
		
		return result;
	}

	public void display() {
		System.out.println("Dessert Name : "+getDessertName()+"\t\t\tweight : "+getWeight()+"\t\t\tprise: "+getCost()+"Rs");		
	}
	
	
}
