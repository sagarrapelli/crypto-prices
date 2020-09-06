package com.cryptoprices.source;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("source")
public abstract class Source {
	protected String currency;

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}
	
}
