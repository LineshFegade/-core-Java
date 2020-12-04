package DessertShopee;

public class Cookies extends DessertItem{
	private double units; 
	
	public Cookies() {
		super();
		units=8;
	}
	public Cookies(String DessertName,double units) {
		super(DessertName);
		this.units=units;
	}
	
	
	public double getUnits() {
		return units;
	}
	public void setUnits(double units) {
		this.units = units;
	}
	@Override
	public double getCost() {
		double result=units*10;
		return result;
	}
	public void display() {
		System.out.println("Dessert Name : "+super.getDessertName()+"\t\t\tunits : "+getUnits()+"\t\t\tprise : "+getCost()+"Rs");
	}

}
