package com.laptrinhjavaweb.dao.impl;

import java.util.List;

import org.apache.commons.lang.StringUtils;

import com.laptrinhjavaweb.dao.IOrderDetailDAO;
import com.laptrinhjavaweb.mapper.OrderDetailMapper;
import com.laptrinhjavaweb.model.OrderDetailModel;
import com.laptrinhjavaweb.paging.Pageble;

public class OrderDetailDAO extends AbstractDAO<OrderDetailModel> implements IOrderDetailDAO {

	@Override
	public OrderDetailModel findOneByProduct(String productId, String orderId) {
		String sql = "SELECT * FROM orderdetail WHERE productId = ? AND orderId=?";
		List<OrderDetailModel> order = query(sql, new OrderDetailMapper(), productId,orderId);
		return order.isEmpty() ? null : order.get(0);
	}

	@Override
	public void update(OrderDetailModel update) {
		StringBuilder sql = new StringBuilder("UPDATE orderdetail SET quantity = ?");
		sql.append(" WHERE orderId = ? and productId=?");
		update(sql.toString(), update.getQuantity(), update.getId(), update.getProductId());
	}

	@Override
	public void delete(String id) {
		String sql = "DELETE FROM orderdetail WHERE productId = ?";
		update(sql, id);
	}

	@Override
	public List<OrderDetailModel> findAll(Pageble pageble) {
		StringBuilder sql = new StringBuilder("SELECT * FROM orderdetail");
		if (pageble.getSorter() != null && StringUtils.isNotBlank(pageble.getSorter().getSortName())
				&& StringUtils.isNotBlank(pageble.getSorter().getSortBy())) {
			sql.append(" ORDER BY " + pageble.getSorter().getSortName() + " " + pageble.getSorter().getSortBy() + "");
		}
		if (pageble.getOffset() != null && pageble.getLimit() != null) {
			sql.append(" LIMIT " + pageble.getOffset() + ", " + pageble.getLimit() + "");
		}
		return query(sql.toString(), new OrderDetailMapper());
	}

	@Override
	public int getTotalItem() {
		String sql = "SELECT count(*) FROM orderdetail";
		return count(sql);
	}

	@Override
	public String save(OrderDetailModel insert) {
		StringBuilder sql = new StringBuilder("INSERT INTO orderdetail (orderId, productId, quantity, price)");
		sql.append("VALUES("+ insert.getId()+", '"+ insert.getProductId()+"', "+insert.getQuantity()+", "+insert.getPrice()+")");
		insertWithId(sql.toString());
		return insert.getProductId();
	}

	@Override
	public List<OrderDetailModel> viewDetail(String id) {
		String sql = "SELECT * FROM orderdetail WHERE orderId = ?";
		return query(sql, new OrderDetailMapper(), id);
	}

}
