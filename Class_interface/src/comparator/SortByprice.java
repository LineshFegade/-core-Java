package comparator;

import java.util.Comparator;

public class SortByprice implements Comparator <Products>{


	@Override
	public int compare(Products o1, Products o2) {
		if(o1.getPrice()== o2.getPrice()) {
			return 0;
		}
		else if(o1.getPrice()< o2.getPrice()) {
			return -1;
		}
		else	{return 1;}
	}

}
