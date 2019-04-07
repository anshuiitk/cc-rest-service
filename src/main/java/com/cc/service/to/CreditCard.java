package com.cc.service.to;

import java.math.BigDecimal;

public class CreditCard {
    private String name;
    private String number;
    private BigDecimal limit;

    public CreditCard(String name, String number, BigDecimal limit) {
        this.name = name;
        this.number = number;
        this.limit = limit;
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
}
