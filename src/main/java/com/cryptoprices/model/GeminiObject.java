package com.cryptoprices.model;

/*
 * POJO of Json returned from Gemini
 */
public class GeminiObject {
	private String last;
	private String bid;
	private String ask;
	
	public String getLast() {
		return last;
	}

	public void setLast(String last) {
		this.last = last;
	}

	public String getBid() {
		return bid;
	}

	public void setBid(String bid) {
		this.bid = bid;
	}

	public String getAsk() {
		return ask;
	}

	public void setAsk(String ask) {
		this.ask = ask;
	}
	
}
