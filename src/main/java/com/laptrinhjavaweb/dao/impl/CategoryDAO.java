package com.laptrinhjavaweb.dao.impl;

import java.util.List;

import org.apache.commons.lang.StringUtils;

import com.laptrinhjavaweb.dao.ICategoryDAO;
import com.laptrinhjavaweb.mapper.CategoryMapper;
import com.laptrinhjavaweb.model.CategoryModel;
import com.laptrinhjavaweb.paging.Pageble;

public class CategoryDAO extends AbstractDAO<CategoryModel> implements ICategoryDAO {

    @Override
    public List<CategoryModel> findAll() {
        String sql = "SELECT * FROM category";
        return query(sql, new CategoryMapper());
    }

    @Override
    public CategoryModel findOne(String id) {
        String sql = "SELECT * FROM category WHERE id = ?";
        List<CategoryModel> category = query(sql, new CategoryMapper(), id);
        return category.isEmpty() ? null : category.get(0);
    }

    @Override
    public CategoryModel findOneByCode(String code) {
        String sql = "SELECT * FROM category WHERE code = ?";
        List<CategoryModel> category = query(sql, new CategoryMapper(), code);
        return category.isEmpty() ? null : category.get(0);
    }

    @Override
    public List<CategoryModel> takeAll(Pageble pageble) {
        StringBuilder sql = new StringBuilder("SELECT * FROM category");
        if (pageble.getSorter() != null && StringUtils.isNotBlank(pageble.getSorter().getSortName()) && StringUtils.isNotBlank(pageble.getSorter().getSortBy())) {
            sql.append(" ORDER BY " + pageble.getSorter().getSortName() + " " + pageble.getSorter().getSortBy() + "");
        }
        if (pageble.getOffset() != null && pageble.getLimit() != null) {
            sql.append(" LIMIT " + pageble.getOffset() + ", " + pageble.getLimit() + "");
        }
        return query(sql.toString(), new CategoryMapper());
    }

    @Override
    public int getTotalItem() {
        String sql = "SELECT count(*) FROM category";
        return count(sql);
    }

    @Override
    public String save(CategoryModel cateModel) {
        StringBuilder sql = new StringBuilder("INSERT INTO category (name, code)");
        sql.append(" VALUES(?, ?)");
        return insert(sql.toString(), cateModel.getName(), cateModel.getCode());
    }

    @Override
    public void update(CategoryModel updateCate) {
        StringBuilder sql = new StringBuilder("UPDATE category SET name = ?, code = ?");
        sql.append(" WHERE id = ?");
        update(sql.toString(), updateCate.getName(), updateCate.getCode(), updateCate.getId());

    }

    @Override
    public void delete(String id) {
        String sql = "DELETE FROM category WHERE id = ?";
        update(sql, id);

    }

}
