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
import com.laptrinhjavaweb.model.ProductModel;
import com.laptrinhjavaweb.paging.PageRequest;
import com.laptrinhjavaweb.paging.Pageble;
import com.laptrinhjavaweb.service.ICategoryService;
import com.laptrinhjavaweb.service.ICrawlerDataFileService;
import com.laptrinhjavaweb.service.IProductService;
import com.laptrinhjavaweb.sort.Sorter;
import com.laptrinhjavaweb.utils.FormUtil;
import com.laptrinhjavaweb.utils.MessageUtil;

@WebServlet(urlPatterns = {"/admin-deleted-product"})
public class DeletedProductController extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	@Inject
    private ICrawlerDataFileService crawlerDataFileService;
    
    @Inject
    private IProductService productService;

    @Inject
    private ICategoryService categoryService;
    
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    
		 ProductModel model = FormUtil.toModel(ProductModel.class, request);
	        String view = "";
	        if (model.getType().equals(SystemConstant.LIST)) {
	            Pageble pageble = new PageRequest(model.getPage(), model.getMaxPageItem(),
	                    new Sorter(model.getSortName(), model.getSortBy(),model.getStatus()),model.getStatus());
	            model.setListResult(productService.findAll(pageble));
	            model.setTotalItem(productService.getTotalItem());
	            model.setTotalPage((int) Math.ceil((double) model.getTotalItem() / model.getMaxPageItem()));
	            
	            view = "/views/admin/product/deletedProduct/list.jsp";
	        } else if (model.getType().equals(SystemConstant.EDIT)) {
	            if (model.getId() != null) {
	                model = productService.findOne(model.getId());
	            }else {
	            	if (model.getName() != null) {
	              		 model = crawlerDataFileService.findOne(model.getFilename(),model.getName());
	                   }   
	            }
	            
	            view = "/views/admin/product/deletedProduct/edit.jsp";
	        }
	        request.setAttribute("categories", categoryService.findAll());
	        MessageUtil.showMessage(request);
	        request.setAttribute(SystemConstant.MODEL, model);
	        RequestDispatcher rd = request.getRequestDispatcher(view);
	        rd.forward(request, response);
    }
	
}
