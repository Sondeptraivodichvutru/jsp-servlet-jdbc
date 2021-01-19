package com.laptrinhjavaweb.service;

import java.util.List;

import com.laptrinhjavaweb.model.OrderModel;
import com.laptrinhjavaweb.paging.Pageble;

public interface IOrderService {
	
	int getTotalItem();

	List<OrderModel> findAll(Pageble pageble);
	
	List<OrderModel> takeAllByUser(String id);

	OrderModel save(OrderModel orderModel);

	OrderModel update(OrderModel orderModel);
	
	void delete(String[] ids);
	
	OrderModel findOne(String id);
}
