package com.cc.service.controller;

import com.cc.service.service.impl.CreditCardServiceImpl;
import com.cc.service.to.CreditCard;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CreditCardController {

    @Autowired
    private CreditCardServiceImpl creditCardService;

    @RequestMapping("/getAll")
    public List<CreditCard> getAll() {
        return creditCardService.getAll();
    }

    @RequestMapping(value = "/add", method = RequestMethod.PUT)
    public boolean add(@RequestParam(value="card", defaultValue="null") CreditCard creditCard)    {
        return creditCardService.add(creditCard);
    }
}