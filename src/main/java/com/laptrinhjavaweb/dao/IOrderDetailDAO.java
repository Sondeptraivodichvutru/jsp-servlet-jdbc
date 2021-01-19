package com.laptrinhjavaweb.dao;

import java.util.List;

import com.laptrinhjavaweb.model.OrderDetailModel;
import com.laptrinhjavaweb.paging.Pageble;

public interface IOrderDetailDAO {
	
	OrderDetailModel findOneByProduct(String productId,String orderId);

	void update(OrderDetailModel update);

	void delete(String id);

	List<OrderDetailModel> findAll(Pageble pageble);

	int getTotalItem();

	String save(OrderDetailModel insert);
	
	List<OrderDetailModel> viewDetail(String id);
}
