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
import com.laptrinhjavaweb.model.ProductModel;
import com.laptrinhjavaweb.service.IProductService;
import com.laptrinhjavaweb.utils.FormUtil;

@WebServlet(urlPatterns = {"/single-product"})
public class SinggleProductController extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Inject
    private IProductService productService;
	
	 protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
		 	ProductModel productModel=  FormUtil.toModel(ProductModel.class, request);
		 	productModel =productService.findOne(productModel.getId());
		 	request.setAttribute(SystemConstant.MODEL, productModel);	
	        RequestDispatcher rd = request.getRequestDispatcher("/views/web/single_product.jsp");
	        rd.forward(request, response);
	    }
	
}
