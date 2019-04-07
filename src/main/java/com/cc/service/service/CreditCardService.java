package com.cc.service.service;

import com.cc.service.to.CreditCard;

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
     * @return
     */
    boolean add(CreditCard creditCard);
}