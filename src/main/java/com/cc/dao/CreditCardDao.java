package com.cc.dao;

import com.cc.to.CreditCard;

import java.util.List;

public interface CreditCardDao {
    List<CreditCard> getAll();
    int add(CreditCard card);
    int remove(String number);
}
