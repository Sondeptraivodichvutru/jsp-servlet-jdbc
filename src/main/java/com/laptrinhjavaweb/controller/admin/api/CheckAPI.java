package com.laptrinhjavaweb.controller.admin.api;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.laptrinhjavaweb.model.OrderDetailModel;
import com.laptrinhjavaweb.model.ProductModel;
import com.laptrinhjavaweb.service.IProductService;
import com.laptrinhjavaweb.utils.HttpUtil;


@WebServlet(urlPatterns = {"/api-admin-check"})
public class CheckAPI extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Inject
	private IProductService productService;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ObjectMapper mapper = new ObjectMapper();
		request.setCharacterEncoding("UTF-8");
		response.setContentType("application/json");
		OrderDetailModel detail = HttpUtil.of(request.getReader()).toModel(OrderDetailModel.class);
		ProductModel pr=new ProductModel();
		pr = productService.findOne(detail.getProductId());
		mapper.writeValue(response.getOutputStream(), pr);
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ObjectMapper mapper = new ObjectMapper();
		request.setCharacterEncoding("UTF-8");
		response.setContentType("application/json");
		OrderDetailModel detail = HttpUtil.of(request.getReader()).toModel(OrderDetailModel.class);
		ProductModel pr=new ProductModel();
		pr = productService.findOne(detail.getProductId());
		mapper.writeValue(response.getOutputStream(), pr);
	}
}
