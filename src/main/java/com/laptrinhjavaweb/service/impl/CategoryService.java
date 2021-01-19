package com.laptrinhjavaweb.service.impl;

import java.util.List;

import javax.inject.Inject;

import com.laptrinhjavaweb.dao.ICategoryDAO;
import com.laptrinhjavaweb.model.CategoryModel;
import com.laptrinhjavaweb.paging.Pageble;
import com.laptrinhjavaweb.service.ICategoryService;

public class CategoryService implements ICategoryService {

    @Inject
    private ICategoryDAO categoryDao;

    @Override
    public List<CategoryModel> findAll() {
        return categoryDao.findAll();
    }

    @Override
    public CategoryModel findOne(String id) {
        CategoryModel categoryModel = categoryDao.findOne(id);
        return categoryModel;
    }

    @Override
    public List<CategoryModel> takeAll(Pageble pageble) {
        return categoryDao.takeAll(pageble);
    }

    @Override
    public int getTotalItem() {
        return categoryDao.getTotalItem();
    }

    @Override
    public CategoryModel save(CategoryModel cateModel) {
        String id = categoryDao.save(cateModel);
        return categoryDao.findOne(id);
    }

    @Override
    public CategoryModel update(CategoryModel updateNew) {
        categoryDao.update(updateNew);
        return categoryDao.findOne(updateNew.getId());
    }

    @Override
    public void delete(String[] ids) {
        for (String id : ids) {
            categoryDao.delete(id);
        }
    }
}
