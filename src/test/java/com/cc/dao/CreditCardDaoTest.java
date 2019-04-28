package com.cc.dao;

import com.cc.dao.impl.CreditCardDaoH2Impl;
import com.cc.to.CreditCard;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.math.BigDecimal;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class CreditCardDaoTest {

    @Autowired
    private CreditCardDaoH2Impl sut;


    @Test
    public void testFindByname() {
        //Given
        // is all setup by autowiring
        //When
        List<CreditCard> cards = sut.getAll();
        //Then
        Assert.assertEquals(3, cards.size());
    }

    @Test
    public void testAdd() {
        //Given
        CreditCard card = new CreditCard("Adam","1111111111111111111", new BigDecimal(100.0), new BigDecimal(100.0));
        //When
        int result = sut.add(card);
        //Then
        Assert.assertEquals(1, result);
        sut.remove(card.getNumber());
    }

}
