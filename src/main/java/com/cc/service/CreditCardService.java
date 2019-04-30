package com.cc.service;

import com.cc.exception.CreditCardAppException;
import com.cc.to.CreditCard;

import java.util.List;

public interface CreditCardService {
    /**
     * returns all cards in the system
     * @return
     */
    List<CreditCard> getAll();

    /**
     * •	"Add" will create a new credit card for a given name, card number, and limit
     * o	Card numbers should be validated using Luhn 10
     * o	New cards start with a £0 balance
     * o	for cards not compatible with Luhn 10, return an error
     * @param creditCard
     * @throws CreditCardAppException
     */
    void add(CreditCard creditCard) throws CreditCardAppException;
}
