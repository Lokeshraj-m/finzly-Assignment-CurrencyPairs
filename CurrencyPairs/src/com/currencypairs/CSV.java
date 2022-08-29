package com.currencypairs;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CSV {
	public static void main(String[] args) throws IOException {
		String filepath = "E:\\CurrencyPairs.csv";
		String line =  null;
		String [] cp = null;
		String cps = null;
		ArrayList<CurrencyPairs> c = new ArrayList<>();
		BufferedReader bf = new BufferedReader(new FileReader(filepath));
		while((line = bf.readLine()) != null) {
			cp = line.split(",");
			cps = cp[0]+cp[1];
			c.add(new CurrencyPairs(cp [0],cp[1],cp[2],cp[3],cp[4],cp[5],cps));
			Collections.sort(c,new CurrencyPairComparator());
		}
		retriveData(c);	
		/*sortDate(c);
		for(CurrencyPairs cc :c) {
			System.out.println(cc); 
			}*/
		/*sortCurrencyPair(c);
		for(CurrencyPairs cc :c) {
			System.out.println(cc); 
			}*/		
	}
	public static void retriveData(ArrayList<CurrencyPairs> c) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Currency Pairs");
		String pairs = input.next();
		for(CurrencyPairs cc:c) {
			if(pairs.equals(cc.getCcy1()+cc.getCcy2())) {
				System.out.println(cc);
			}
		}
		
		
	}
	public static void sortDate(ArrayList<CurrencyPairs> c) {
		Collections.sort(c,new DateComparator());
	}
	public static void sortCurrencyPair(ArrayList<CurrencyPairs> c) {
		Collections.sort(c,new CurrencyPairComparator());
	}

}


