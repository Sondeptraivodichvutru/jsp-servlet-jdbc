package com.laptrinhjavaweb.service.impl;

import java.util.List;

import javax.inject.Inject;

import com.laptrinhjavaweb.dao.IPaymentDAO;
import com.laptrinhjavaweb.model.PaymentModel;
import com.laptrinhjavaweb.paging.Pageble;
import com.laptrinhjavaweb.service.IPaymentService;


public class PaymentService implements IPaymentService {
	@Inject
	private IPaymentDAO paymentDAO;
	

	@Override
	public List<PaymentModel> findAll() {
		return paymentDAO.findAll();
	}

	@Override
	public PaymentModel findOne(String id) {
		PaymentModel categoryModel = paymentDAO.findOne(id);
		return categoryModel;
	}

	@Override
	public List<PaymentModel> takeAll(Pageble pageble) {
		return paymentDAO.takeAll(pageble);
	}

	@Override
	public int getTotalItem() {
		return paymentDAO.getTotalItem();
	}

	@Override
	public PaymentModel save(PaymentModel cateModel) {
		String id = paymentDAO.save(cateModel);
		return paymentDAO.findOne(id);
	}

	@Override
	public PaymentModel update(PaymentModel updateNew) {
		paymentDAO.update(updateNew);
		return paymentDAO.findOne(updateNew.getId());
	}

	@Override
	public void delete(String[] ids) {
		for (String id : ids) {
			paymentDAO.delete(id);
		}
	}

}
