package com.laptrinhjavaweb.service.impl;

import java.util.List;

import javax.inject.Inject;

import com.laptrinhjavaweb.dao.IOrderDetailDAO;
import com.laptrinhjavaweb.model.OrderDetailModel;
import com.laptrinhjavaweb.paging.Pageble;
import com.laptrinhjavaweb.service.IOrderDetailService;

public class OrderDetailService implements IOrderDetailService{


	@Inject
    private IOrderDetailDAO orderDetailDAO;

	
	@Override
	public int getTotalItem() {
		return orderDetailDAO.getTotalItem();
	}

	@Override
	public List<OrderDetailModel> findAll(Pageble pageble) {
		return orderDetailDAO.findAll(pageble);
	}

	@Override
	public OrderDetailModel save(OrderDetailModel insert) {
		String id = orderDetailDAO.save(insert);
        return orderDetailDAO.findOneByProduct(id,insert.getId());
	}

	@Override
	public OrderDetailModel update(OrderDetailModel update) {
		orderDetailDAO.update(update);
        return orderDetailDAO.findOneByProduct(update.getProductId(),update.getId());
	}

	@Override
	public void delete(String[] ids) {
		for (String id : ids) {
			orderDetailDAO.delete(id);
        }
	}


	@Override
	public List<OrderDetailModel> viewDetail(String id) {
		 return orderDetailDAO.viewDetail(id);
	}


	@Override
	public OrderDetailModel findOneByProduct(String productId, String id) {
		OrderDetailModel order = orderDetailDAO.findOneByProduct(productId, id);
        return order;
	}

}
