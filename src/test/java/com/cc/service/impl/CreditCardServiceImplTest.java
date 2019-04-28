package com.cc.service.impl;

import com.cc.dao.CreditCardDao;
import com.cc.to.CreditCard;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.math.BigDecimal;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class CreditCardServiceImplTest {

    private CreditCardServiceImpl sut = new CreditCardServiceImpl();

    @Before
    public void before() {
        CreditCardDao creditCardDao = Mockito.mock(CreditCardDao.class);
        sut.setCreditCardDao(creditCardDao);
    }


    /**
     * Test Case from Wikipedia Tested
     */
    @Test
    public void testValidLuhnNumbers()  {
        CreditCard creditCard = new CreditCard("Test", "79927398710", new BigDecimal(1.0), new BigDecimal(1.0));
        Assert.assertFalse(sut.luhn10CheckOk(creditCard));
        creditCard.setNumber("79927398711");
        Assert.assertFalse(sut.luhn10CheckOk(creditCard));
        creditCard.setNumber("4659502942275349");
        Assert.assertTrue(sut.luhn10CheckOk(creditCard));
        creditCard.setNumber("79927398713");
        Assert.assertFalse(sut.luhn10CheckOk(creditCard));
        creditCard.setNumber("79927398714");
        Assert.assertFalse(sut.luhn10CheckOk(creditCard));
        creditCard.setNumber("79927398715");
        Assert.assertFalse(sut.luhn10CheckOk(creditCard));
        creditCard.setNumber("79927398716");
        Assert.assertFalse(sut.luhn10CheckOk(creditCard));
        creditCard.setNumber("79927398717");
        Assert.assertFalse(sut.luhn10CheckOk(creditCard));
        creditCard.setNumber("79927398718");
        Assert.assertFalse(sut.luhn10CheckOk(creditCard));
        creditCard.setNumber("79927398719");
        Assert.assertFalse(sut.luhn10CheckOk(creditCard));
    }
}
