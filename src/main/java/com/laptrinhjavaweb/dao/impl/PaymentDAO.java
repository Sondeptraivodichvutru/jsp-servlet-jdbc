package com.laptrinhjavaweb.dao.impl;

import java.util.List;

import org.apache.commons.lang.StringUtils;

import com.laptrinhjavaweb.dao.IPaymentDAO;
import com.laptrinhjavaweb.mapper.PaymentMapper;
import com.laptrinhjavaweb.model.PaymentModel;
import com.laptrinhjavaweb.paging.Pageble;

public class PaymentDAO  extends AbstractDAO<PaymentModel> implements IPaymentDAO {

    @Override
    public List<PaymentModel> findAll() {
        String sql = "SELECT * FROM payment";
        return query(sql, new PaymentMapper());
    }

    @Override
    public PaymentModel findOne(String id) {
        String sql = "SELECT * FROM payment WHERE id = ?";
        List<PaymentModel> category = query(sql, new PaymentMapper(), id);
        return category.isEmpty() ? null : category.get(0);
    }

    @Override
    public PaymentModel findOneByCode(String code) {
        String sql = "SELECT * FROM payment WHERE code = ?";
        List<PaymentModel> category = query(sql, new PaymentMapper(), code);
        return category.isEmpty() ? null : category.get(0);
    }

    @Override
    public List<PaymentModel> takeAll(Pageble pageble) {
        StringBuilder sql = new StringBuilder("SELECT * FROM payment");
        if (pageble.getSorter() != null && StringUtils.isNotBlank(pageble.getSorter().getSortName()) && StringUtils.isNotBlank(pageble.getSorter().getSortBy())) {
            sql.append(" ORDER BY " + pageble.getSorter().getSortName() + " " + pageble.getSorter().getSortBy() + "");
        }
        if (pageble.getOffset() != null && pageble.getLimit() != null) {
            sql.append(" LIMIT " + pageble.getOffset() + ", " + pageble.getLimit() + "");
        }
        return query(sql.toString(), new PaymentMapper());
    }

    @Override
    public int getTotalItem() {
        String sql = "SELECT count(*) FROM payment";
        return count(sql);
    }

    @Override
    public String save(PaymentModel cateModel) {
        StringBuilder sql = new StringBuilder("INSERT INTO payment (name, code)");
        sql.append(" VALUES(?, ?)");
        return insert(sql.toString(), cateModel.getName(), cateModel.getCode());
    }

    @Override
    public void update(PaymentModel updateCate) {
        StringBuilder sql = new StringBuilder("UPDATE payment SET name = ?, code = ?");
        sql.append(" WHERE id = ?");
        update(sql.toString(), updateCate.getName(), updateCate.getCode(), updateCate.getId());

    }

    @Override
    public void delete(String id) {
        String sql = "DELETE FROM payment WHERE id = ?";
        update(sql, id);

    }
}
