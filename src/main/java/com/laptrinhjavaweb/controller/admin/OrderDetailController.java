package com.laptrinhjavaweb.controller.admin;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.laptrinhjavaweb.constant.SystemConstant;
import com.laptrinhjavaweb.model.OrderDetailModel;
import com.laptrinhjavaweb.service.IOrderDetailService;
import com.laptrinhjavaweb.service.IProductService;
import com.laptrinhjavaweb.utils.FormUtil;
import com.laptrinhjavaweb.utils.MessageUtil;

@WebServlet(urlPatterns = { "/admin-order-detail" })
public class OrderDetailController extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Inject
	private IOrderDetailService orderDetailService;
	@Inject
	private IProductService productService;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		OrderDetailModel model = FormUtil.toModel(OrderDetailModel.class, request);
		String view = "";
		if (model.getType().equals(SystemConstant.LIST)) {
			model.setListResult(orderDetailService.viewDetail(model.getId()));
			model.setTotalItem(orderDetailService.getTotalItem());
			 model.setTotalPage((int) Math.ceil((double) model.getTotalItem() / model.getMaxPageItem()));
			view = "/views/admin/order/detail/list.jsp";
		} else {
			if (model.getType().equals(SystemConstant.EDIT)) {
				if (model.getProductId() != null) {
					model = orderDetailService.findOneByProduct(model.getProductId(),model.getId());
				}
				view = "/views/admin/order/detail/edit.jsp";
			} 
		}
		request.setAttribute("product", productService.takeAll());
		MessageUtil.showMessage(request);
		request.setAttribute(SystemConstant.MODEL, model);
		RequestDispatcher rd = request.getRequestDispatcher(view);
		rd.forward(request, response);
	}
}
