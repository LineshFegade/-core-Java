package DessertShopee;

public class TestDessertShoppe {
	public static void main(String[] args) {
		double totalcost=0;
	
		DessertItem[] d= {new Candy("candy",850),new Cookies("cookies",50),new IceCream("icecream",8)};
		for (int i = 0; i < d.length; i++) {
			d[i].display();
			totalcost+=d[i].getCost();
		}
		System.out.println("------------------------------------------------------------------------------------------------------");
		System.out.println("\nTotal Amount :\t\t\t\t\t\t\t\t\t"+totalcost+"Rs.");
	}
	
}
