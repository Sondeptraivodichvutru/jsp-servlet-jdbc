/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.laptrinhjavaweb.service;

import com.laptrinhjavaweb.model.CrawlerModel;
import com.laptrinhjavaweb.paging.Pageble;

import java.util.List;

public interface ICrawlerService {

	int getTotalItem();

	List<CrawlerModel> findAll(Pageble pageble);

	CrawlerModel save(CrawlerModel crawlerModel);

	CrawlerModel update(CrawlerModel crawlerModel);
	
	void delete(String[] ids);
	
	CrawlerModel findOne(String id);
}
