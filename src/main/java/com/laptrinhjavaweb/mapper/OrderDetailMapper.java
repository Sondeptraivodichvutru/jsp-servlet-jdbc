package com.laptrinhjavaweb.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.laptrinhjavaweb.model.OrderDetailModel;

public class OrderDetailMapper implements RowMapper<OrderDetailModel> {

	@Override
	public OrderDetailModel mapRow(ResultSet rs) {
		try {
			OrderDetailModel orderDetail = new OrderDetailModel();			
			orderDetail.setId(rs.getString("orderId"));
			orderDetail.setProductId(rs.getString("productId"));
			orderDetail.setQuantity(rs.getInt("quantity"));
			orderDetail.setPrice(rs.getFloat("price"));
			return orderDetail;
		} catch (SQLException e) {
			return null;
		}
	}
	
}
