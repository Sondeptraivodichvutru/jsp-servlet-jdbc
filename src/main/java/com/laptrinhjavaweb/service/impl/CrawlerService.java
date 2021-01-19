package com.laptrinhjavaweb.service.impl;

import java.util.List;

import javax.inject.Inject;

import com.laptrinhjavaweb.dao.ICrawlerDAO;
import com.laptrinhjavaweb.model.CrawlerModel;
import com.laptrinhjavaweb.paging.Pageble;
import com.laptrinhjavaweb.service.ICrawlerService;

public class CrawlerService implements ICrawlerService{

	 @Inject
	    private ICrawlerDAO crawlerDAO;
	
	@Override
	public int getTotalItem() {
		return crawlerDAO.getTotalItem();
	}

	@Override
	public List<CrawlerModel> findAll(Pageble pageble) {
		return crawlerDAO.findAll(pageble);
	}

	@Override
	public CrawlerModel save(CrawlerModel crawlerModel) {
		String id = crawlerDAO.save(crawlerModel);
        return crawlerDAO.findOne(id);
	}

	@Override
	public CrawlerModel update(CrawlerModel crawlerModel) {
		crawlerDAO.update(crawlerModel);
        return crawlerDAO.findOne(crawlerModel.getId());
	}

	@Override
	public void delete(String[] ids) {
		for (String id : ids) {
			crawlerDAO.delete(id);
        }
		
	}

	@Override
	public CrawlerModel findOne(String id) {
		CrawlerModel newModel = crawlerDAO.findOne(id);
	        return newModel;
	}

}
