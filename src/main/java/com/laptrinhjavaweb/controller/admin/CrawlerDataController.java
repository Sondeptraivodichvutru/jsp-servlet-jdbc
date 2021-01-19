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
import com.laptrinhjavaweb.model.CrawlerModel;
import com.laptrinhjavaweb.model.ProductModel;
import com.laptrinhjavaweb.service.ICrawlerDataService;
import com.laptrinhjavaweb.utils.FormUtil;
import com.laptrinhjavaweb.utils.MessageUtil;

@WebServlet(urlPatterns = {"/admin-crawlerData"})
public class CrawlerDataController extends HttpServlet{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Inject
    private ICrawlerDataService crawlerDataService;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ProductModel model = FormUtil.toModel(ProductModel.class, request);
        CrawlerModel cm = FormUtil.toModel(CrawlerModel.class, request);
        String view = "";
        if (model.getType().equals(SystemConstant.LIST)) {
            model.setListResult(crawlerDataService.takeData(cm.getLink(),cm.getFilename()));
            crawlerDataService.WriteToFile((crawlerDataService.getJson(model.getListResult(), cm.getFilename())), cm.getFilename());
//            model.setListResult(crawlerDataService.ReadToFile(cm.getFilename()));
            view = "/views/admin/crawler/data/listFromFile.jsp";
        } else if (model.getType().equals(SystemConstant.EDIT)) {
            view = "/views/admin/crawler/data/edit.jsp";
        }
        MessageUtil.showMessage(request);
        request.setAttribute(SystemConstant.MODEL, model);
        RequestDispatcher rd = request.getRequestDispatcher(view);
        rd.forward(request, response);

    }

}
