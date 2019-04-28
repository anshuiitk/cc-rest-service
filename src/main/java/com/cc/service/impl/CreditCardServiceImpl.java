package com.cc.service.impl;

import com.cc.dao.CreditCardDao;
import com.cc.exception.CreditCardAppException;
import com.cc.service.CreditCardService;
import com.cc.to.CreditCard;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

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
    public void add(CreditCard creditCard) throws CreditCardAppException {
        if(!luhn10CheckOk(creditCard))   throw new CreditCardAppException("Credit Card number failed Luhn 10 Test");
        if(creditCardDao.add(creditCard) == 0) throw new CreditCardAppException("Could not add credit card to the database");
    }

    protected boolean luhn10CheckOk(CreditCard creditCard)   {
        Assert.notNull(creditCard,"Credit Card cannot be null");
        Assert.notNull(creditCard.getNumber(),"Credit Card Number cannot be null");
        if(!StringUtils.isNumeric(creditCard.getNumber()))
            throw new IllegalArgumentException("Credit card number can have only digits");
        boolean result = false;
        char[] digits = creditCard.getNumber().toCharArray();
        int sum = 0;
        boolean needsSum = false;
        for(int i=digits.length-1;i>-1;--i)   {
            int x = digits[i];
            if(needsSum)    {
                x = digits[i]*2;
                if(x>9) x -= 9;
            }
            needsSum = !needsSum;
            sum += x;
        }
        result = sum%10 == 0;
        return result;
    }

    @Autowired
    public void setCreditCardDao(CreditCardDao creditCardDao) {
        this.creditCardDao = creditCardDao;
    }
}
