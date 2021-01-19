package com.laptrinhjavaweb.dao;

import java.util.List;

import com.laptrinhjavaweb.model.ProductModel;
import com.laptrinhjavaweb.paging.Pageble;

public interface IProductDAO extends GenericDAO<ProductModel> {

	 List<ProductModel> takeAll();
	
    ProductModel findOne(String id);

    List<ProductModel> findByCategoryId(String categoryId);

    String save(ProductModel addProduct);

    String setId(String name);

    void update(ProductModel updateProduct);

    void delete(String id);
    
    void rehibilitate(String id);

    List<ProductModel> findAll(Pageble pageble);

    int getTotalItem();
    
    ProductModel findOneByname(String name);
}
