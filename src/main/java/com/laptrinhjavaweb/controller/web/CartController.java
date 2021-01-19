package com.laptrinhjavaweb.controller.web;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.laptrinhjavaweb.model.OrderModel;
import com.laptrinhjavaweb.model.ProductModel;
import com.laptrinhjavaweb.service.IProductService;
import com.laptrinhjavaweb.utils.FormUtil;

@WebServlet(urlPatterns = { "/cart" })
public class CartController extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Inject
	private IProductService productService;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int quantity = 1;
		float total = 0;
		ProductModel productModel = FormUtil.toModel(ProductModel.class, request);
		if (productModel.getId() != null) {
			productModel = productService.findOne(productModel.getId());
			if (productModel != null) {			
				if (request.getParameter("quantity") != null) {
					quantity = Integer.parseInt(request.getParameter("quantity"));
				}			
				HttpSession session = request.getSession();				
				if (session.getAttribute("cart") == null) {
					List<ProductModel> list = new ArrayList<>();
					OrderModel orderModel = new OrderModel();
					ProductModel item = new ProductModel();
					item.setTotalItem(quantity);
					item.setId(productModel.getId());
					item.setName(productModel.getName());
					item.setImage(productModel.getImage());
					item.setPrice(productModel.getPrice());
					item.setTotalPrice(item.getTotalItem()*Float.parseFloat(item.getPrice()));
					list.add(item);
					orderModel.setItems(list);
					session.setAttribute("cart", orderModel);
					List<ProductModel> productItemss= orderModel.getItems();					
					for (ProductModel product : productItemss) {
						total=total+product.getTotalPrice();
					}
					orderModel.setTotal(Float.toString(total));
					session.setAttribute("total", orderModel.getTotal());
				} else {
					OrderModel orderModel = (OrderModel) session.getAttribute("cart");
					boolean flag = false;
					List<ProductModel> productItems= orderModel.getItems();
					for (ProductModel product : productItems) {
						if (product.getId().equals(productModel.getId())) {
							product.setTotalItem(product.getTotalItem() + quantity);
							product.setTotalPrice(product.getTotalItem()*Float.parseFloat(product.getPrice()));
							flag = true;
						}
					}
					if (flag == false) {
						ProductModel product = new ProductModel();
						product.setTotalItem(quantity);
						product.setId(productModel.getId());
						product.setName(productModel.getName());
						product.setImage(productModel.getImage());
						product.setPrice(productModel.getPrice());
						product.setTotalPrice(product.getTotalItem()*Float.parseFloat(product.getPrice()));
						productItems.add(product);	
						orderModel.setItems(productItems);
					}
					session.setAttribute("cart", orderModel);
					List<ProductModel> productItemss= orderModel.getItems();					
					for (ProductModel product : productItemss) {
						total=total+product.getTotalPrice();
					}
					orderModel.setTotal(Float.toString(total));
					session.setAttribute("total", orderModel.getTotal());
				}
			}
			
		}	
        response.sendRedirect(request.getContextPath() + "/trang-chu");
	}

}
