package com.cryptoprices.source;

import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.cryptoprices.mapper.Mapper;
import com.cryptoprices.model.BitStampObject;
import com.cryptoprices.model.Price;
/*
 * This class is used to get data from BitStamp API
 */
@Component
public class BitStamp extends Source {
	
	private String url = "https://www.bitstamp.net/api/v2/ticker/";
	
	public Price getPrices(String cryptocurrency) {
		String uri = url + cryptocurrency + currency;
		RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<BitStampObject> responseEntity = restTemplate.exchange(uri, HttpMethod.GET, null, BitStampObject.class);
        return Mapper.getPriceObject(responseEntity.getBody());
	}	
}