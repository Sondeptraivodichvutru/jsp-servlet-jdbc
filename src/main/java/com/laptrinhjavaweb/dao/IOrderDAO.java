package com.laptrinhjavaweb.dao;

import java.util.List;

import com.laptrinhjavaweb.model.OrderModel;
import com.laptrinhjavaweb.paging.Pageble;

public interface IOrderDAO {
	
	OrderModel findOne(String id);
	
	void update(OrderModel updateOrder);

    void delete(String id);

    List<OrderModel> findAll(Pageble pageble);
     
    List<OrderModel> takeAllByUser(String id);

    int getTotalItem();
    
    String save(OrderModel orderInsert);
	
	
}
