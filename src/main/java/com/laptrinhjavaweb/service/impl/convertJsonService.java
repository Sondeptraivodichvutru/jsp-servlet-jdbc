package com.laptrinhjavaweb.service.impl;

import java.util.List;

import com.google.gson.Gson;
import com.laptrinhjavaweb.model.ProductModel;

public class convertJsonService {
	
	    public String getJson(List<ProductModel> listMobiles) {
	        String jsonData = new Gson().toJson(listMobiles);
	        return jsonData;
	    }
}
