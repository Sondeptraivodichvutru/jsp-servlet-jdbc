package com.laptrinhjavaweb.service.impl;

import java.util.List;

import javax.inject.Inject;

import com.laptrinhjavaweb.dao.IOrderDAO;
import com.laptrinhjavaweb.model.OrderModel;
import com.laptrinhjavaweb.paging.Pageble;
import com.laptrinhjavaweb.service.IOrderService;

public class OrderService implements IOrderService{

	@Inject
    private IOrderDAO orderDAO;

	
	@Override
	public int getTotalItem() {
		return orderDAO.getTotalItem();
	}

	@Override
	public List<OrderModel> findAll(Pageble pageble) {
		return orderDAO.findAll(pageble);
	}

	@Override
	public OrderModel save(OrderModel orderModel) {
		String id = orderDAO.save(orderModel);
        return orderDAO.findOne(id);
	}

	@Override
	public OrderModel update(OrderModel orderModel) {
		orderDAO.update(orderModel);
        return orderDAO.findOne(orderModel.getId());
	}

	@Override
	public void delete(String[] ids) {
		for (String id : ids) {
			orderDAO.delete(id);
        }
	}

	@Override
	public OrderModel findOne(String id) {
		OrderModel newModel = orderDAO.findOne(id);
        return newModel;
	}

	@Override
	public List<OrderModel> takeAllByUser(String id) {
		return orderDAO.takeAllByUser(id);
	}

}
