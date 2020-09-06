package com.cryptoprices.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.cryptoprices.model.Price;
import com.cryptoprices.service.PriceService;


@Controller
public class CryptoController {
	
	@Autowired
	private PriceService priceService;
	
	@RequestMapping(value = "/price", method = RequestMethod.GET)
	public String getPrice(@RequestParam String id, ModelMap model) {
		List<Price> list = priceService.getExchangePrices(id);
		model.put("prices", list);
		model.put("sell", getMaxSellingPrice(list));
		model.put("buy", getMinBuyingPrice(list));
        return "price";
	}
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String welcome(ModelMap model) {
		return "welcome";
	}
	
	public String getMaxSellingPrice(List<Price> list) {
		return list.stream().max((e1,e2) -> e1.getBid().compareTo(e2.getBid()) > 0?1:-1).get().getExchange();
	}
	
	public String getMinBuyingPrice(List<Price> list) {
		return list.stream().min((e1,e2) -> e1.getAsk().compareTo(e2.getAsk()) > 0?1:-1).get().getExchange();
	}
}
