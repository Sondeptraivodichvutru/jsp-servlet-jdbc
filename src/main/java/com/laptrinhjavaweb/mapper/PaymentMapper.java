package com.laptrinhjavaweb.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.laptrinhjavaweb.model.PaymentModel;

public class PaymentMapper implements RowMapper<PaymentModel>{

	@Override
	public PaymentModel mapRow(ResultSet rs) {
		try {
			PaymentModel payment = new PaymentModel();
			payment.setId(rs.getString("id"));
			payment.setCode(rs.getString("code"));
			payment.setName(rs.getString("name"));
            return payment;
        } catch (SQLException e) {
            return null;
        }
	}

}
