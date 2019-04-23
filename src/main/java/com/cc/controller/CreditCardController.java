package com.cc.controller;

import com.cc.service.impl.CreditCardServiceImpl;
import com.cc.to.CreditCard;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class CreditCardController {

	@Autowired
	private CreditCardServiceImpl creditCardService;

	@RequestMapping("/api/getAll")
	public List<CreditCard> getAll() {
		return creditCardService.getAll();
	}

	@RequestMapping(value = "/add", method = RequestMethod.PUT)
	public int add(@RequestBody CreditCard creditCard) {
		return creditCardService.add(creditCard);
	}
}
