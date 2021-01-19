package com.laptrinhjavaweb.dao.impl;

import java.util.List;

import org.apache.commons.lang.StringUtils;

import com.laptrinhjavaweb.dao.IProductDAO;
import com.laptrinhjavaweb.mapper.ProductMapper;
import com.laptrinhjavaweb.model.ProductModel;
import com.laptrinhjavaweb.paging.Pageble;

public class ProductDAO extends AbstractDAO<ProductModel> implements IProductDAO {

    @Override
    public ProductModel findOne(String id) {
        String sql = "SELECT * FROM product WHERE id =?";
        List<ProductModel> news = query(sql, new ProductMapper(), id);
        return news.isEmpty() ? null : news.get(0);
    }

    @Override
    public List<ProductModel> findByCategoryId(String categoryId) {
        String sql = "SELECT * FROM product WHERE categoryid = ?";
        return query(sql, new ProductMapper(), categoryId);
    }

    @Override
    public String save(ProductModel addProduct) {
    	String a="ac";
    	addProduct.setId(a);
    	if(addProduct.getFilename()=="") {
    		StringBuilder sql = new StringBuilder("INSERT INTO product (id,name,categoryid, price, des, saleOff, image,status)");
            sql.append(" VALUES(?,?, ?, ?, ?, ?, ?, ?)");
            
             insert(sql.toString(),  addProduct.getId(),addProduct.getName(),
                    addProduct.getCategoryId(), addProduct.getPrice(), addProduct.getDescription(),
                    addProduct.getSale(), addProduct.getImage(),1);
    	} else {
    		StringBuilder sql = new StringBuilder("INSERT INTO product (id,name,categoryid, price, des, saleOff, filename, image,status)");
            sql.append(" VALUES(?,?, ?, ?, ?, ?, ?, ?,?)");
            
             insert(sql.toString(),  addProduct.getId(),addProduct.getName(),
                    addProduct.getCategoryId(), addProduct.getPrice(), addProduct.getDescription(),
                    addProduct.getSale(), addProduct.getFilename(), addProduct.getImage(),1);
    	}
         return setId(addProduct.getName());
        
    }

    @Override
    public String setId(String name) {
        String sql = new String("UPDATE product INNER JOIN category on category.id = product.categoryid  SET  product.id = CONCAT(category.code , product.code)\r\n" + 
        		"where product.name = ? and product.id= 'ac' ;");        
        update(sql, name);
		return name;
    }

    @Override
    public void update(ProductModel updateProduct) {
        StringBuilder sql = new StringBuilder("UPDATE product SET name = ?, categoryId = ?, price = ?, des = ?, saleOff = ?, image = ?");
        sql.append(" WHERE id = ?");
        update(sql.toString(), updateProduct.getName(), updateProduct.getCategoryId(), updateProduct.getPrice(), updateProduct.getDescription(), updateProduct.getSale(), updateProduct.getImage(), updateProduct.getId());
     
        
    }

    @Override
    public void delete(String id) {
        String sql = "UPDATE `product` SET `status` = '0' WHERE (`id` = ?);";
        update(sql, id);
    }

    @Override
    public List<ProductModel> findAll(Pageble pageble) {
        StringBuilder sql = new StringBuilder("SELECT * FROM product");
        if(pageble.getStatus()!=null) {
        	sql.append(" WHERE status="+pageble.getStatus());	
        }
        if (pageble.getSorter() != null && StringUtils.isNotBlank(pageble.getSorter().getSortName())
                && StringUtils.isNotBlank(pageble.getSorter().getSortBy())) {
            sql.append(" ORDER BY " + pageble.getSorter().getSortName() + " " + pageble.getSorter().getSortBy() + "");
        }
        if (pageble.getOffset() != null && pageble.getLimit() != null) {
            sql.append(" LIMIT " + pageble.getOffset() + ", " + pageble.getLimit() + " ");
        }
        
        return query(sql.toString(), new ProductMapper());
    }

    @Override
    public int getTotalItem() {
        String sql = "SELECT count(*) FROM product";
        return count(sql);
    }

	@Override
	public ProductModel findOneByname(String name) {
		String sql = "SELECT * FROM product WHERE name =?";
        List<ProductModel> news = query(sql, new ProductMapper(), name);
        return news.isEmpty() ? null : news.get(0);
	}

	@Override
	public List<ProductModel> takeAll() {
		 String sql = "SELECT * FROM product where status=1";
	        return query(sql, new ProductMapper());
	}

	@Override
	public void rehibilitate(String id) {
		String sql = "UPDATE product SET status = ? WHERE id = ?;";
        update(sql,1, id);		
	}

}
