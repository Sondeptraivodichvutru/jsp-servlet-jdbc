package com.laptrinhjavaweb.controller.web;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.laptrinhjavaweb.constant.SystemConstant;
import com.laptrinhjavaweb.model.OrderModel;
import com.laptrinhjavaweb.model.UserModel;
import com.laptrinhjavaweb.service.IOrderService;
import com.laptrinhjavaweb.service.IPaymentService;
import com.laptrinhjavaweb.utils.FormUtil;
import com.laptrinhjavaweb.utils.SessionUtil;

@WebServlet(urlPatterns = { "/purchase-history" })
public class PurchaseHistoryController extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Inject
	private IOrderService orderService;

	@Inject
	private IPaymentService paymentService;


	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		OrderModel model = FormUtil.toModel(OrderModel.class, request);
		String view = "";
		request.setAttribute("payment", paymentService.findAll());
		String id= ((UserModel) SessionUtil.getInstance().getValue(request, "USERMODEL")).getId();
		if (id != null) {
			model.setListResult(orderService.takeAllByUser(id));
		}else {
			response.sendRedirect(request.getContextPath()
					+ "/dang-nhap?action=login&message=not_login&alert=danger");
		}
		view = "/views/web/purchase_history.jsp";
		request.setAttribute(SystemConstant.MODEL, model);
		RequestDispatcher rd = request.getRequestDispatcher(view);
		rd.forward(request, response);
	}

}
