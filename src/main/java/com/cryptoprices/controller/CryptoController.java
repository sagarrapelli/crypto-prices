package com.cryptoprices.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cryptoprices.model.Price;
import com.cryptoprices.model.Result;
import com.cryptoprices.service.PriceService;


@RestController
public class CryptoController {
	
	@Autowired
	private PriceService priceService;
	
	@CrossOrigin
	@RequestMapping(value = "/price", method = RequestMethod.GET)
	public Result getPrice(@RequestParam String id, ModelMap model) {
		List<Price> list = priceService.getExchangePrices(id);
		Result res = new Result();
		res.setPrices(list);
		res.setBuy(getMinBuyingPrice(list));
		res.setSell(getMaxSellingPrice(list));
		return res;
	}
	
	
	public String getMaxSellingPrice(List<Price> list) {
		return list.stream().max((e1,e2) -> e1.getBid().compareTo(e2.getBid()) > 0?1:-1).get().getExchange();
	}
	
	
	public String getMinBuyingPrice(List<Price> list) {
		return list.stream().min((e1,e2) -> e1.getAsk().compareTo(e2.getAsk()) > 0?1:-1).get().getExchange();
	}
}
