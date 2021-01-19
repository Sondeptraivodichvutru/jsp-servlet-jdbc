package com.laptrinhjavaweb.service;

import java.util.List;

import com.laptrinhjavaweb.model.PaymentModel;
import com.laptrinhjavaweb.paging.Pageble;

public interface IPaymentService {

    List<PaymentModel> findAll();

    List<PaymentModel> takeAll(Pageble pageble);

    PaymentModel findOne(String id);

    int getTotalItem();

    PaymentModel save(PaymentModel Insert);

    PaymentModel update(PaymentModel update);

    void delete(String[] ids);
    
}
