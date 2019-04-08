package com.cc.service.impl;

import com.cc.service.CreditCardService;
import com.cc.to.CreditCard;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Component
public class CreditCardServiceImpl implements CreditCardService {

    @Override
    public List<CreditCard> getAll() {
        ArrayList<CreditCard> creditCards = new ArrayList<>();
        CreditCard creditCard = new CreditCard("AG", "1234 1234 1234 1234", new BigDecimal("5000.00"), new BigDecimal("1000.00"));
        creditCards.add(creditCard);
        creditCard = new CreditCard("AG", "1234 1234 1234 5678", new BigDecimal("6000.00"), new BigDecimal("500.00"));
        creditCards.add(creditCard);
        return creditCards;
    }

    @Override
    public boolean add(CreditCard creditCard) {
        return false;
    }
}
