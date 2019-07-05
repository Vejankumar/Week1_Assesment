package com.sapient.week1.assesment;

import java.util.Comparator;





public class Comparators{

	public static Comparator<Dishes> getComparator(int type)
	{
		switch(type)
		{
		case 1:
			return new CaloriesIncComparator();
		case 2:
			return new CaloriesDecComparator();
		case 3:
			return new PriceIncComparator();
		case 4:
			return new PriceDecComparator();
		default :
			return new PriceDecComparator();
		
		}
	}
}

class CaloriesIncComparator implements Comparator<Dishes>{

	@Override
	public int compare(Dishes dish1, Dishes dish2) {
	
		return (int) (dish1.getCalories()-dish2.getCalories());
	}
	
}

class CaloriesDecComparator implements Comparator<Dishes>{

	@Override
	public int compare(Dishes dish1, Dishes dish2) {
			
		return (int) (dish2.getCalories()-dish1.getCalories());
	}
	
}

class PriceIncComparator implements Comparator<Dishes>{

	@Override
	public int compare(Dishes dish1, Dishes dish2) {
			
		return (int) (dish1.getPrice()-dish2.getPrice());
	}
	
}

class PriceDecComparator implements Comparator<Dishes>{

	@Override
	public int compare(Dishes dish1, Dishes dish2) {
		
		return (int) (dish2.getPrice()-dish1.getPrice());
	}
	
}
