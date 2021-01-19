package com.laptrinhjavaweb.service;

import java.util.ArrayList;
import java.util.List;

import com.laptrinhjavaweb.model.ProductModel;

public interface ICrawlerDataService {
	List<ProductModel> takeData(String link,String filename);
	
    String getJson(List<ProductModel> listMobiles,String filename);

    void WriteToFile(String list, String filename);
    
    void DeleteFile(String filename);
       
    ArrayList<ProductModel> ReadToFile(String filename);
	
	
}
