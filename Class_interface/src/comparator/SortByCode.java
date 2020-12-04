 package comparator;

import java.util.Comparator;

public class SortByCode implements Comparator<Products> {

	@Override
	public int compare(Products o1, Products o2) {
		if(o1.getCode()== o2.getCode()) {
			return 0;
		}
		else if(o1.getCode()< o2.getCode()) {
			return -1;
		}
		else	{return 1;}
	}

	

}
