package com.laptrinhjavaweb.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.laptrinhjavaweb.model.OrderModel;

public class OrderMapper implements RowMapper<OrderModel> {

	@Override
	public OrderModel mapRow(ResultSet rs) {
		try {
			OrderModel order = new OrderModel();			
			order.setId(rs.getString("id"));
			order.setUserId(rs.getString("userId"));
			order.setPaymentId(rs.getString("paymentId"));
			order.setStatus(rs.getInt("status"));
			order.setAddress(rs.getString("address"));
			order.setTotal(Float.toString(rs.getFloat("total")));
			order.setModifiedDate(rs.getTimestamp("updateddate"));
			order.setCreatedDate(rs.getTimestamp("createddate"));
			return order;
		} catch (SQLException e) {
			return null;
		}
	}

}
