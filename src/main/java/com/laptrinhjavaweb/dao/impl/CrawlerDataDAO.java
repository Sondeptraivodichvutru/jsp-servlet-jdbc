package com.laptrinhjavaweb.dao.impl;

import javax.inject.Inject;

import com.laptrinhjavaweb.dao.ICrawlerDataDAO;
import com.laptrinhjavaweb.model.ProductModel;
import com.laptrinhjavaweb.service.IProductService;

public class CrawlerDataDAO extends AbstractDAO<ProductModel> implements ICrawlerDataDAO{
	@Inject
	private IProductService productService;
	@Override
	public ProductModel save(ProductModel crawlerModel) {
		  StringBuilder sql = new StringBuilder("INSERT INTO product (id,name,categoryid, price, image)");
	        sql.append(" VALUES(?, ?, ?, ?, ?)");
	        
	         insert(sql.toString(), crawlerModel.getId(), crawlerModel.getName(),
	        		 crawlerModel.getCategoryId(), crawlerModel.getPrice(), crawlerModel.getImage());
	         return productService.findOneByname(productService.setId(crawlerModel.getName()));
	}

	@Override
	public void update(ProductModel crawlerModel) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		
	}


}
