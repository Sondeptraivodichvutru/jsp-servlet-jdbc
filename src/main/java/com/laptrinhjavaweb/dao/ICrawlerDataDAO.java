package com.laptrinhjavaweb.dao;


import com.laptrinhjavaweb.model.ProductModel;

public interface ICrawlerDataDAO extends GenericDAO<ProductModel>{
	
	ProductModel save(ProductModel crawlerModel);
	void update(ProductModel crawlerModel);
    void delete(String id);
    
}
