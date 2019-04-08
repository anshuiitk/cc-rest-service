package com.cc.to;

import java.math.BigDecimal;

public class CreditCard {

    private String name;
    private String number;
    private BigDecimal limit;
    private BigDecimal balance;

    public CreditCard() {
    }

    public CreditCard(String name, String number, BigDecimal limit, BigDecimal balance) {
        this.name = name;
        this.number = number;
        this.limit = limit;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public BigDecimal getLimit() {
        return limit;
    }

    public void setLimit(BigDecimal limit) {
        this.limit = limit;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }
}
