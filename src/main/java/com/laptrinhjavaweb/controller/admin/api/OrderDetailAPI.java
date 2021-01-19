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
import com.laptrinhjavaweb.model.UserModel;
import com.laptrinhjavaweb.service.IOrderDetailService;
import com.laptrinhjavaweb.utils.HttpUtil;
import com.laptrinhjavaweb.utils.SessionUtil;

@WebServlet(urlPatterns = { "/api-admin-order-detail" })
public class OrderDetailAPI  extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Inject
	private IOrderDetailService orderDetailService;
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ObjectMapper mapper = new ObjectMapper();
		request.setCharacterEncoding("UTF-8");
		response.setContentType("application/json");
		OrderDetailModel detail = HttpUtil.of(request.getReader()).toModel(OrderDetailModel.class);
		detail = orderDetailService.save(detail);
		mapper.writeValue(response.getOutputStream(), detail);
	}

	protected void doPut(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ObjectMapper mapper = new ObjectMapper();
		request.setCharacterEncoding("UTF-8");
		response.setContentType("application/json");
		OrderDetailModel updateNew = HttpUtil.of(request.getReader()).toModel(OrderDetailModel.class);
		updateNew.setModifiedBy(((UserModel) SessionUtil.getInstance().getValue(request, "USERMODEL")).getUserName());
		updateNew = orderDetailService.update(updateNew);
		mapper.writeValue(response.getOutputStream(), "success");
	}

	protected void doDelete(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ObjectMapper mapper = new ObjectMapper();
		request.setCharacterEncoding("UTF-8");
		response.setContentType("application/json");
		OrderDetailModel newModel = HttpUtil.of(request.getReader()).toModel(OrderDetailModel.class);
		orderDetailService.delete(newModel.getIds());
		mapper.writeValue(response.getOutputStream(), "{}");
	}
	
}
