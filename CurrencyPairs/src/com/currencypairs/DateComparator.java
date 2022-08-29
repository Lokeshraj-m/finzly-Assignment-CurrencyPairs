package com.currencypairs;

import java.util.Comparator;

public class DateComparator implements Comparator<CurrencyPairs>{

	@Override
	public int compare(CurrencyPairs o1, CurrencyPairs o2) {
		// TODO Auto-generated method stub
		return o1.getLastUpdatedTime().compareTo(o2.getLastUpdatedTime());
	}
	

}
