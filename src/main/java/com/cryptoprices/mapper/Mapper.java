package com.cryptoprices.mapper;

import com.cryptoprices.model.BitStampObject;
import com.cryptoprices.model.GeminiObject;
import com.cryptoprices.model.Price;

/*
 * Utility class for mapping json objects from different exchanges to Price object
 */
public class Mapper {
	
	public static Price getPriceObject(BitStampObject obj) {
		Price price = new Price();
		price.setAsk(Double.parseDouble(obj.getAsk()));
		price.setBid(Double.parseDouble(obj.getBid()));
		price.setExchange("BitStamp");
		return price;
	}
	
	public static Price getPriceObject(GeminiObject obj) {
		Price price = new Price();
		price.setAsk(Double.parseDouble(obj.getAsk()));
		price.setBid(Double.parseDouble(obj.getBid()));
		price.setExchange("Gemini");
		return price;
	}

}
