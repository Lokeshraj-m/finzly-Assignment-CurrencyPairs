package com.currencypairs;

public class CurrencyPairs  {
	private String Ccy1;
	private String Ccy2;
	private String spotdays;
	private String WeekendDays;
	private String Precision;
	private String LastUpdatedTime;
	private String CurrencyPairs;
	
	public String getCurrencyPairs() {
		return CurrencyPairs;
	}
	public void setCurrencyPairs(String currencyPairs) {
		CurrencyPairs = currencyPairs;
	}
	public String getCcy1() {
		return Ccy1;
	}
	public String getCcy2() {
		return Ccy2;
	}
	public String getSpotdays() {
		return spotdays;
	}
	public String getWeekendDays() {
		return WeekendDays;
	}
	public String getPrecision() {
		return Precision;
	}
	public String getLastUpdatedTime() {
		return LastUpdatedTime;
	}
	public CurrencyPairs(String ccy1, String ccy2, String spotdays, String weekendDays, String precision,
			String lastUpdatedTime, String currencyPairs) {
		super();
		Ccy1 = ccy1;
		Ccy2 = ccy2;
		this.spotdays = spotdays;
		WeekendDays = weekendDays;
		Precision = precision;
		LastUpdatedTime = lastUpdatedTime;
		CurrencyPairs = currencyPairs;
	}
	@Override
	public String toString() {
		return "CurrencyPairs [Ccy1=" + Ccy1 + ", Ccy2=" + Ccy2 + ", spotdays=" + spotdays + ", WeekendDays="
				+ WeekendDays + ", Precision=" + Precision + ", LastUpdatedTime=" + LastUpdatedTime + ", CurrencyPairs="
				+ CurrencyPairs + "]";
	}
	
	
	

}
