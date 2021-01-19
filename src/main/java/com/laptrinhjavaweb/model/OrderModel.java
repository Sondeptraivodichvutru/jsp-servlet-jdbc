package com.laptrinhjavaweb.model;

import java.util.List;

public class OrderModel extends AbstractModel<OrderModel> {

	private String userId;
	private String paymentId;
	private String address;
	private String total;
	private String tax;
	private List<ProductModel> items;
	
	
	public String getTax() {
		return tax;
	}
	public void setTax(String tax) {
		this.tax = tax;
	}

	public List<ProductModel> getItems() {
		return items;
	}
	public void setItems(List<ProductModel> items) {
		this.items = items;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPaymentId() {
		return paymentId;
	}
	public void setPaymentId(String paymentId) {
		this.paymentId = paymentId;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getTotal() {
		return total;
	}
	public void setTotal(String total) {
		this.total = total;
	}
	
	
	
	
	
}
