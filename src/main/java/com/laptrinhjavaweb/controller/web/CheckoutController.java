package com.laptrinhjavaweb.controller.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.laptrinhjavaweb.model.OrderModel;
import com.laptrinhjavaweb.model.ProductModel;
import com.laptrinhjavaweb.model.UserModel;
import com.laptrinhjavaweb.utils.SessionUtil;

@WebServlet(urlPatterns = { "/checkout" })
public class CheckoutController extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	 protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 	HttpSession session = request.getSession();		 	
		 	UserModel userModel= (UserModel) SessionUtil.getInstance().getValue(request, "USERMODEL");
		 	OrderModel orderModel = (OrderModel) session.getAttribute("cart");
		 	String total = (String) session.getAttribute("total");
		 	if(orderModel!=null) {
		 		List<ProductModel> productItems= orderModel.getItems();
				request.setAttribute("items", productItems);	
				request.setAttribute("total", total);	
		 	}					 	
		 	request.setAttribute("user", userModel);	
	        RequestDispatcher rd = request.getRequestDispatcher("/views/web/checkout.jsp");
	        rd.forward(request, response);
	    }
	 protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 HttpSession session = request.getSession();				
			if (session.getAttribute("cart") == null) {
				
			}
	 }
	
}
