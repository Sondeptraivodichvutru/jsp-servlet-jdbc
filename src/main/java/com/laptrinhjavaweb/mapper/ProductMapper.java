package com.laptrinhjavaweb.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.laptrinhjavaweb.model.ProductModel;

public class ProductMapper implements RowMapper<ProductModel> {

    @Override
    public ProductModel mapRow(ResultSet rs) {
        try {
            ProductModel news = new ProductModel();
            news.setId(rs.getString("id"));
            news.setName(rs.getString("name"));
            news.setCategoryId(rs.getString("categoryid"));
            news.setPrice(rs.getString("price"));
            news.setDescription(rs.getString("des"));
            news.setSale(rs.getString("saleOff"));
            news.setFilename(rs.getString("filename"));
            news.setCode(rs.getString("code"));
            news.setImage(rs.getString("image"));
            return news;
        } catch (SQLException e) {
            return null;
        }
    }

}
