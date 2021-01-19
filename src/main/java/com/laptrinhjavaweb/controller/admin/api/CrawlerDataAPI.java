package com.laptrinhjavaweb.controller.admin.api;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.laptrinhjavaweb.model.CrawlerModel;
import com.laptrinhjavaweb.model.UserModel;
import com.laptrinhjavaweb.service.ICrawlerService;
import com.laptrinhjavaweb.utils.HttpUtil;
import com.laptrinhjavaweb.utils.SessionUtil;


@WebServlet(urlPatterns = {"/api-admin-crawlerData"})
public class CrawlerDataAPI extends HttpServlet{
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	 @Inject
	    private ICrawlerService crawlerService;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
	            throws ServletException, IOException {
			
		  ObjectMapper mapper = new ObjectMapper();
	        request.setCharacterEncoding("UTF-8");
	        response.setContentType("application/json");
	        CrawlerModel crawl = HttpUtil.of(request.getReader()).toModel(CrawlerModel.class);
	        crawl.setCreatedBy(((UserModel) SessionUtil.getInstance().getValue(request, "USERMODEL")).getUserName());
	        crawl = crawlerService.save(crawl);
	        mapper.writeValue(response.getOutputStream(), crawl);
	    }
}
