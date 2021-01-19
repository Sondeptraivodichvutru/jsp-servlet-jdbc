package com.laptrinhjavaweb.dao;

import java.util.List;

import com.laptrinhjavaweb.model.CrawlerModel;
import com.laptrinhjavaweb.paging.Pageble;

public interface ICrawlerDAO extends GenericDAO<CrawlerModel>{
	int getTotalItem();
	List<CrawlerModel> findAll(Pageble pageble);
	String save(CrawlerModel crawlerModel);
	void update(CrawlerModel crawlerModel);
    void delete(String id);
	CrawlerModel findOne(String id);
	

	
}
