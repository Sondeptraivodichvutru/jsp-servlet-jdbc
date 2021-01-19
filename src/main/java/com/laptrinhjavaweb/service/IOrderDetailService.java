package com.laptrinhjavaweb.service;

import java.util.List;

import com.laptrinhjavaweb.model.OrderDetailModel;
import com.laptrinhjavaweb.paging.Pageble;

public interface IOrderDetailService {
	
	int getTotalItem();

	List<OrderDetailModel> findAll(Pageble pageble);

	OrderDetailModel save(OrderDetailModel insert);

	OrderDetailModel update(OrderDetailModel update);
	
	void delete(String[] ids);
	
	OrderDetailModel findOneByProduct(String productId,String id);
	
	List<OrderDetailModel> viewDetail(String id) ;
}
