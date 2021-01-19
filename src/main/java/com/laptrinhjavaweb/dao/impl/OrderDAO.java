package com.laptrinhjavaweb.dao.impl;

import java.util.List;

import org.apache.commons.lang.StringUtils;

import com.laptrinhjavaweb.dao.IOrderDAO;
import com.laptrinhjavaweb.mapper.OrderMapper;
import com.laptrinhjavaweb.model.OrderModel;
import com.laptrinhjavaweb.paging.Pageble;

public class OrderDAO extends AbstractDAO<OrderModel> implements IOrderDAO{

	@Override
	public OrderModel findOne(String id) {
		String sql = "SELECT * FROM tblorder WHERE id = ?";
		List<OrderModel> order = query(sql, new OrderMapper(), id);
		return order.isEmpty() ? null : order.get(0);
	}

	@Override
	public void update(OrderModel updateOrder) {
		StringBuilder sql = new StringBuilder("UPDATE tblorder SET paymentId = ?, updateddate=CURRENT_TIMESTAMP, status=?,address=?");
		sql.append(" WHERE id = ?");
		update(sql.toString(), updateOrder.getPaymentId(), updateOrder.getStatus(), updateOrder.getAddress(),updateOrder.getId());
	}

	@Override
	public void delete(String id) {
		String sql = " UPDATE `jspservletjdbc`.`tblorder` SET `status` = ? WHERE (`id` = ?)";
        update(sql,0, id);	
	}

	@Override
	public List<OrderModel> findAll(Pageble pageble) {
		StringBuilder sql = new StringBuilder("SELECT * FROM tblorder");
		if (pageble.getSorter() != null && StringUtils.isNotBlank(pageble.getSorter().getSortName())
				&& StringUtils.isNotBlank(pageble.getSorter().getSortBy())) {
			sql.append(" ORDER BY " + pageble.getSorter().getSortName() + " " + pageble.getSorter().getSortBy() + "");
		}
		if (pageble.getOffset() != null && pageble.getLimit() != null) {
			sql.append(" LIMIT " + pageble.getOffset() + ", " + pageble.getLimit() + "");
		}
		return query(sql.toString(), new OrderMapper());
	}

	@Override
	public int getTotalItem() {
		String sql = "SELECT count(*) FROM tblorder";
		return count(sql);
	}

	@Override
	public String save(OrderModel orderInsert) {
		int count = getTotalItem()+1;
		String i =orderInsert.getAddress()+ count;
		StringBuilder sql = new StringBuilder("INSERT INTO tblorder (id,userId,paymentId, createddate, status, address)");
        sql.append(" VALUES(?,?, ?, CURRENT_TIMESTAMP, ?, ?)");
        
           insert(sql.toString(), i, orderInsert.getUserId(),
        		 orderInsert.getPaymentId(), orderInsert.getStatus(),
        		 orderInsert.getAddress());
         return i;
	}

	@Override
	public List<OrderModel> takeAllByUser(String id) {
		StringBuilder sql = new StringBuilder("SELECT * FROM tblorder where userId="+id+" and status=1");		
		return query(sql.toString(),new OrderMapper());
	}

}
