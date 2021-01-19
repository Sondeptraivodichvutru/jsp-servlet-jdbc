package com.laptrinhjavaweb.service.impl;

import java.util.List;

import javax.inject.Inject;

import com.laptrinhjavaweb.dao.ICategoryDAO;
import com.laptrinhjavaweb.dao.IProductDAO;
import com.laptrinhjavaweb.model.CategoryModel;
import com.laptrinhjavaweb.model.ProductModel;
import com.laptrinhjavaweb.paging.Pageble;
import com.laptrinhjavaweb.service.IProductService;

public class ProductService implements IProductService {

    @Inject
    private IProductDAO productDAO;

    @Inject
    private ICategoryDAO categoryDAO;

    @Override
    public List<ProductModel> findByCategoryId(String categoryId) {
        return productDAO.findByCategoryId(categoryId);
    }

    @Override
    public ProductModel save(ProductModel addProduct) {
        CategoryModel category = categoryDAO.findOneByCode(addProduct.getCategoryCode());
        addProduct.setCategoryId(category.getId());
        String name = productDAO.save(addProduct);
        return productDAO.findOneByname(name);
    }

    @Override
    public ProductModel update(ProductModel updateProduct) {
        CategoryModel category = categoryDAO.findOneByCode(updateProduct.getCategoryCode());
        updateProduct.setCategoryId(category.getId());
        productDAO.update(updateProduct);
        return productDAO.findOne(updateProduct.getId());
    }

    @Override
    public void delete(String[] ids) {
        for (String id : ids) {
            productDAO.delete(id);
        }
    }

    @Override
    public List<ProductModel> findAll(Pageble pageble) {
        return productDAO.findAll(pageble);
    }

    @Override
    public int getTotalItem() {
        return productDAO.getTotalItem();
    }

    @Override
    public ProductModel findOne(String id) {
        ProductModel newModel = productDAO.findOne(id);
        CategoryModel categoryModel = categoryDAO.findOne(newModel.getCategoryId());
        newModel.setCategoryCode(categoryModel.getCode());
        return newModel;
    }

    @Override
    public String setId(String name) {
        return productDAO.setId(name);

    }

	@Override
	public ProductModel findOneByname(String name) {
		ProductModel newModel = productDAO.findOneByname(name);
        CategoryModel categoryModel = categoryDAO.findOne(newModel.getCategoryId());
        newModel.setCategoryCode(categoryModel.getCode());
        return newModel;
	}

	@Override
	public List<ProductModel> takeAll() {
		return productDAO.takeAll();
	}

	@Override
	public void rehibilitate(String[] ids) {
		for (String id : ids) {
            productDAO.rehibilitate(id);
        }
	}

}
