/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.laptrinhjavaweb.controller.admin;

import com.laptrinhjavaweb.constant.SystemConstant;
import com.laptrinhjavaweb.model.CrawlerModel;
import com.laptrinhjavaweb.paging.PageRequest;
import com.laptrinhjavaweb.paging.Pageble;
import com.laptrinhjavaweb.service.ICrawlerService;
import com.laptrinhjavaweb.sort.Sorter;
import com.laptrinhjavaweb.utils.FormUtil;
import com.laptrinhjavaweb.utils.MessageUtil;
import java.io.IOException;
import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = { "/admin-crawler" })
public class CrawlerController extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Inject
	private ICrawlerService crawlerService;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		  CrawlerModel model = FormUtil.toModel(CrawlerModel.class, request);
	        String view = "";
	        if (model.getType().equals(SystemConstant.LIST)) {
	            Pageble pageble = new PageRequest(model.getPage(), model.getMaxPageItem(),
	                    new Sorter(model.getSortName(), model.getSortBy(),model.getStatus()),model.getStatus());
	            model.setListResult(crawlerService.findAll(pageble));
	            model.setTotalItem(crawlerService.getTotalItem());
	            model.setTotalPage((int) Math.ceil((double) model.getTotalItem() / model.getMaxPageItem()));
	            view = "/views/admin/crawler/list.jsp";
	        } else if (model.getType().equals(SystemConstant.EDIT)) {
	            if (model.getId() != null) {
	                model = crawlerService.findOne(model.getId());
	            }
	            view = "/views/admin/crawler/edit.jsp";
	        }
	        MessageUtil.showMessage(request);
	        request.setAttribute(SystemConstant.MODEL, model);
	        RequestDispatcher rd = request.getRequestDispatcher(view);
	        rd.forward(request, response);
	}
}
