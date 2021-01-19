package com.laptrinhjavaweb.service;


import com.laptrinhjavaweb.model.ProductModel;

public interface ICrawlerDataFileService {

	void setStatus(String filename, String name, String message);
	
	
	ProductModel findOne(String filename,String name);
}
