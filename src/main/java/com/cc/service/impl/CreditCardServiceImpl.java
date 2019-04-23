package com.cc.service.impl;

import com.cc.dao.CreditCardDao;
import com.cc.service.CreditCardService;
import com.cc.to.CreditCard;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CreditCardServiceImpl implements CreditCardService {

    private CreditCardDao creditCardDao;

    @Override
    public List<CreditCard> getAll() {
        List<CreditCard> creditCards = creditCardDao.getAll();
        return creditCards;
    }

    @Override
    public int add(CreditCard creditCard) {
        return creditCardDao.add(creditCard);
    }

    @Autowired
    public void setCreditCardDao(CreditCardDao creditCardDao) {
        this.creditCardDao = creditCardDao;
    }
}
