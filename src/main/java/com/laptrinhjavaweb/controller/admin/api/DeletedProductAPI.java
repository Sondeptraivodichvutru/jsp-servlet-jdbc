package com.laptrinhjavaweb.controller.admin.api;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.laptrinhjavaweb.model.ProductModel;
import com.laptrinhjavaweb.service.IProductService;
import com.laptrinhjavaweb.utils.HttpUtil;

@WebServlet(urlPatterns = {"/api-admin-deleted-product"})
public class DeletedProductAPI extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Inject
    private IProductService productService;
	 protected void doDelete(HttpServletRequest request, HttpServletResponse response)
	            throws ServletException, IOException {
	        ObjectMapper mapper = new ObjectMapper();
	        request.setCharacterEncoding("UTF-8");
	        response.setContentType("application/json");
	        ProductModel productModel = HttpUtil.of(request.getReader()).toModel(ProductModel.class);
	        productService.rehibilitate(productModel.getIds());
	        mapper.writeValue(response.getOutputStream(), "{}");
	    }
}
