package com.cryptoprices.model;

import java.util.List;

/*
 * Object to be returned on GET request
 */
public class Result {
	private List<Price> prices;
	private String buy;
	private String sell;
	public List<Price> getPrices() {
		return prices;
	}
	public void setPrices(List<Price> prices) {
		this.prices = prices;
	}
	public String getBuy() {
		return buy;
	}
	public void setBuy(String buy) {
		this.buy = buy;
	}
	public String getSell() {
		return sell;
	}
	public void setSell(String sell) {
		this.sell = sell;
	}

}
