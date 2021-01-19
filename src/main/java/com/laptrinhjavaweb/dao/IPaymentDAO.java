package com.laptrinhjavaweb.dao;

import java.util.List;

import com.laptrinhjavaweb.model.PaymentModel;
import com.laptrinhjavaweb.paging.Pageble;

public interface IPaymentDAO extends GenericDAO<PaymentModel> {

    List<PaymentModel> findAll();

    List<PaymentModel> takeAll(Pageble pageble);

    PaymentModel findOne(String id);

    PaymentModel findOneByCode(String code);

    int getTotalItem();

    String save(PaymentModel insert);

    void update(PaymentModel update);

    void delete(String id);
}
