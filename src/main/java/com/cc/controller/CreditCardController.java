package com.cc.controller;

import com.cc.exception.CreditCardAppException;
import com.cc.service.impl.CreditCardServiceImpl;
import com.cc.to.CreditCard;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class CreditCardController {

	private final Logger LOGGER = LoggerFactory.getLogger(CreditCardController.class);

	@Autowired
	private CreditCardServiceImpl creditCardService;

	@RequestMapping("/api/getAll")
	public List<CreditCard> getAll() {
		return creditCardService.getAll();
	}

	@RequestMapping(value = "/add", method = RequestMethod.PUT)
	public String add(@RequestBody CreditCard creditCard) {
		String result = "Card added successfully";
		try {
			creditCardService.add(creditCard);
			LOGGER.debug("Returning value : "+ result);
		} catch (CreditCardAppException e) {
			LOGGER.debug("Returning value : "+ e.getMessage());
			LOGGER.error("Error occured while adding credit card : "+creditCard, e);
			result = e.getMessage();
		}
		return result;
	}
}
