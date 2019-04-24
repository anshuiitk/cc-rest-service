package com.cc.dao.impl;

import com.cc.dao.CreditCardDao;
import com.cc.to.CreditCard;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class CreditCardDaoH2Impl implements CreditCardDao {


    @Autowired
    private JdbcTemplate template;

    @Override
    public List<CreditCard> getAll() {
        String sql = "SELECT * FROM CreditCard";
        List<CreditCard> result = template.query(sql, new UserMapper());
        return result;
    }

    @Override
    public int add(CreditCard card) {
        return template.update("insert into CreditCard (number, name, limit, balance) " + "values(?, ?, ?, ?)",
                new Object[] { card.getNumber(), card.getName(), card.getLimit(), card.getBalance() });
    }


    @Autowired
    public void setTemplate(JdbcTemplate template) {
        this.template = template;
    }

    private static final class UserMapper implements RowMapper<CreditCard> {

        public CreditCard mapRow(ResultSet rs, int rowNum) throws SQLException {
            CreditCard creditCard = new CreditCard();
            creditCard.setLimit(rs.getBigDecimal("limit"));
            creditCard.setBalance(rs.getBigDecimal("balance"));
            creditCard.setName(rs.getString("name"));
            creditCard.setNumber(rs.getString("number"));
            return creditCard;
        }
    }

}
