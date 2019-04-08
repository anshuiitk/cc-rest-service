package com.cc.dao;

import com.cc.dao.impl.CreditCardDaoH2Impl;
import com.cc.to.CreditCard;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {TestAppConfig.class})
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

}
