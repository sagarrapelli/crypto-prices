package com.cryptoprices.source;

import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.cryptoprices.mapper.Mapper;
import com.cryptoprices.model.GeminiObject;
import com.cryptoprices.model.Price;

@Component
public class Gemini extends Source {
	
	private String url = "https://api.gemini.com/v1/pubticker/";
	
	public Price getPrices(String cryptocurrency) {
		String uri = url + cryptocurrency + currency;
		RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<GeminiObject> responseEntity = restTemplate.exchange(uri, HttpMethod.GET, null, GeminiObject.class);
        return Mapper.getPriceObject(responseEntity.getBody());
	}
}
