package com.cc.service.service.impl;

import com.cc.service.service.CreditCardService;
import com.cc.service.to.CreditCard;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Component
public class CreditCardServiceImpl implements CreditCardService {

    @Override
    public List<CreditCard> getAll() {
        CreditCard creditCard = new CreditCard("AG", "1234 1234 1234 1234", new BigDecimal("5000.00"));
        ArrayList<CreditCard> creditCards = new ArrayList<>();
        creditCards.add(creditCard);
        return creditCards;
    }

    @Override
    public boolean add(CreditCard creditCard) {
        return false;
    }
}
