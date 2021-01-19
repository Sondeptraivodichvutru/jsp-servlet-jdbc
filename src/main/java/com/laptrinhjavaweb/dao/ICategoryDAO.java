package com.laptrinhjavaweb.dao;

import java.util.List;

import com.laptrinhjavaweb.model.CategoryModel;
import com.laptrinhjavaweb.paging.Pageble;

public interface ICategoryDAO extends GenericDAO<CategoryModel> {

    List<CategoryModel> findAll();

    List<CategoryModel> takeAll(Pageble pageble);

    CategoryModel findOne(String id);

    CategoryModel findOneByCode(String code);

    int getTotalItem();

    String save(CategoryModel cateModel);

    void update(CategoryModel updateCate);

    void delete(String id);
}
