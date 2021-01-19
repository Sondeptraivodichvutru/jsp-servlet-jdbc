package com.laptrinhjavaweb.service;

import java.util.List;

import com.laptrinhjavaweb.model.ProductModel;
import com.laptrinhjavaweb.paging.Pageble;

public interface IProductService {

	List<ProductModel> takeAll();
	
     List<ProductModel> findByCategoryId(String categoryId);

    ProductModel save(ProductModel addProduct);

    String setId(String name);

    ProductModel update(ProductModel updateProduct);

    void delete(String[] ids);
    
    void rehibilitate(String[] ids);

    List<ProductModel> findAll(Pageble pageble);

    int getTotalItem();

    ProductModel findOne(String id);
    
    ProductModel findOneByname(String name);
}
