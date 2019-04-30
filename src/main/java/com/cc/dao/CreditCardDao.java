package com.cc.dao;

import com.cc.to.CreditCard;

import java.util.List;

/**
 * Interface to database for operations such as retrieving all credit cards, adding and removing them.
 */
public interface CreditCardDao {
    /**
     * Finds and returns all possible credit cards found in the system
     * @return a list of cards
     */
    List<CreditCard> getAll();

    /**
     * Add a new card to the system
     *
     * @param card
     * @return
     */
    int add(CreditCard card);

    /**
     * Removes an existing card from the system.
     *
     * @param number
     * @return
     */
    int remove(String number);
}
