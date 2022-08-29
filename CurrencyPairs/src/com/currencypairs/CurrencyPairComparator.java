package com.currencypairs;

import java.util.Comparator;

public class CurrencyPairComparator implements Comparator<CurrencyPairs> {

	@Override
	public int compare(CurrencyPairs o1, CurrencyPairs o2) {
		// TODO Auto-generated method stub
		return o1.getCurrencyPairs().compareToIgnoreCase(o2.getCurrencyPairs());
	}
	

}
