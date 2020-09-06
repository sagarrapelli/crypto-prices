package com.cryptoprices.service;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cryptoprices.model.Price;
import com.cryptoprices.source.BitStamp;
import com.cryptoprices.source.Gemini;


@Service
public class PriceService {
	
	@Autowired
	BitStamp bitStamp;
	
	@Autowired
	Gemini gemini;
	
	public List<Price> getExchangePrices(String cryptocurrency) {
		List<Price> list = new ArrayList<>();
		list.add(bitStamp.getPrices(cryptocurrency));
		list.add(gemini.getPrices(cryptocurrency));
		return list;
	}
}
