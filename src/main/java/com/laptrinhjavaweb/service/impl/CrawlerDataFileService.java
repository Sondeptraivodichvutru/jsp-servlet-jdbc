package com.laptrinhjavaweb.service.impl;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.laptrinhjavaweb.model.ProductModel;
import com.laptrinhjavaweb.service.ICrawlerDataFileService;

public class CrawlerDataFileService implements ICrawlerDataFileService{


	@SuppressWarnings("unchecked")
	@Override
	public void setStatus(String filename, String name, String message) {
		ArrayList<JSONObject> listMobiles = new ArrayList<>();
        ArrayList<ProductModel> productModel = new ArrayList<>();
        JSONParser jsonParser = new JSONParser();
        try {
            BufferedReader buff = new BufferedReader(new InputStreamReader(new FileInputStream("E:\\DataCrawler\\" + filename + ".txt"), "UTF-8"));
            listMobiles = (ArrayList<JSONObject>) jsonParser.parse(buff);

        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        for (JSONObject c : listMobiles) {
            ProductModel item = new ProductModel();
            item.setName(c.get("name").toString());
            item.setPrice(c.get("price").toString());
            item.setContent(c.get("content").toString());
            item.setFilename(filename);
            item.setImage(c.get("image").toString());
            item.setDetailUrl(c.get("DetailUrl").toString());

            if (c.get("name").equals(name)) {
                item.setMessage(message);
            }
            productModel.add(item);
        }

//        WriteToFile(getJson(productModel), filename);
    
	}

	@SuppressWarnings("unchecked")
	@Override
	public ProductModel findOne(String filename, String name) {
		 ArrayList<JSONObject> listMobiles = new ArrayList<>();
	        JSONParser jsonParser = new JSONParser();
	        try {
	            BufferedReader buff = new BufferedReader(new InputStreamReader(new FileInputStream("E:\\DataCrawler\\" + filename + ".txt"), "UTF-8"));
	            listMobiles = (ArrayList<JSONObject>) jsonParser.parse(buff);

	        } catch (FileNotFoundException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        } catch (IOException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        } catch (ParseException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        }

	        ProductModel productModel = new ProductModel();
	        for (JSONObject c : listMobiles) {
	            if (c.get("name").equals(name)) {
	                productModel.setName(c.get("name").toString());
	                productModel.setPrice(c.get("price").toString());
	                productModel.setImage(c.get("image").toString());
	                productModel.setDescription(c.get("description").toString());
	                productModel.setFilename(c.get("filename").toString());
	                break;
	            }
	        }
	        return productModel;
	}

}
