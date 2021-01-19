package com.laptrinhjavaweb.service;

import java.util.List;

import com.laptrinhjavaweb.model.CategoryModel;
import com.laptrinhjavaweb.paging.Pageble;

public interface ICategoryService {

    List<CategoryModel> findAll();

    List<CategoryModel> takeAll(Pageble pageble);

    CategoryModel findOne(String id);

    int getTotalItem();

    CategoryModel save(CategoryModel cateModel);

    CategoryModel update(CategoryModel updateCate);

    void delete(String[] ids);
}
