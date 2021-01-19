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
import com.laptrinhjavaweb.model.OrderModel;
import com.laptrinhjavaweb.paging.PageRequest;
import com.laptrinhjavaweb.paging.Pageble;
import com.laptrinhjavaweb.service.IOrderService;
import com.laptrinhjavaweb.sort.Sorter;
import com.laptrinhjavaweb.utils.FormUtil;
import com.laptrinhjavaweb.utils.MessageUtil;

@WebServlet(urlPatterns = {"/admin-deleted-order"})
public class DeletedOrderController extends HttpServlet  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Inject
	private IOrderService orderService;
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    
		 OrderModel model = FormUtil.toModel(OrderModel.class, request);
	        String view = "";
	        if (model.getType().equals(SystemConstant.LIST)) {
	            Pageble pageble = new PageRequest(model.getPage(), model.getMaxPageItem(),
	                    new Sorter(model.getSortName(), model.getSortBy(),model.getStatus()),model.getStatus());
	            model.setListResult(orderService.findAll(pageble));
	            model.setTotalItem(orderService.getTotalItem());
	            model.setTotalPage((int) Math.ceil((double) model.getTotalItem() / model.getMaxPageItem()));
	            
	            view = "/views/admin/product/deletedOrder/list.jsp";
	        }         
	        MessageUtil.showMessage(request);
	        request.setAttribute(SystemConstant.MODEL, model);
	        RequestDispatcher rd = request.getRequestDispatcher(view);
	        rd.forward(request, response);
   }
	
}
