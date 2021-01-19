package com.laptrinhjavaweb.service.impl;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import com.google.gson.Gson;
import com.laptrinhjavaweb.model.ProductModel;
import com.laptrinhjavaweb.service.ICrawlerDataService;

public class CrawlerDataService implements ICrawlerDataService {


    @Override
    public ArrayList<ProductModel> takeData(String link, String filename) {
        try {
            ArrayList<ProductModel> listMobiles = new ArrayList<>();

            Document doc = Jsoup.connect(link).get();

            Elements elements = doc.getElementsByClass("product-item");

            for (Element e : elements) {         	  	
                ProductModel item = new ProductModel();
                
                Element name = e.getElementsByClass("name").first();
                
                StringBuilder sb=new StringBuilder();   
                sb.append(name.toString());
                sb.delete(0, 26);
                sb.reverse();
                sb.delete(0, 14);
                sb.reverse();
                item.setName(sb.toString());
                
                Element price = e.getElementsByClass("price-discount__price").first();
                StringBuilder sbp=new StringBuilder();   
                sbp.append(price.toString());
                sbp.delete(0, 37);
                sbp.reverse();
                sbp.delete(0, 9);
                sbp.reverse();
                item.setPrice(sbp.toString());
                
                item.setFilename(filename);
               try {
            	   Element element = e.select("img[src]").get(0);
            	   item.setImage(element.attr("src"));
               }catch(IndexOutOfBoundsException ex){
            	   Element element = e.select("img[src]").get(1);
            	   item.setImage(element.attr("src"));
               }
                String linkShot=e.attr("href");
                item.setDetailUrl("https://tiki.vn"+linkShot);
                                    
                Document des = Jsoup.connect(item.getDetailUrl()).get();
                 
//                item.setDescription(des.select("meta[name=description]").first().attr("content"));
                
                Elements elementss = des.getElementsByClass("ToggleContent__View-sc-1hm81e2-0");
                item.setDescription(elementss.toString());
                
                
                listMobiles.add(item);
            }
            return listMobiles;
        } catch (IOException ex) {
            return null;
        }
    }
    @Override
    public String getJson(List<ProductModel> listMobiles, String filename) {
    	File myObj = new File("E:\\DataCrawler\\" + filename + ".txt");
    	try {
			myObj.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        String jsonData = new Gson().toJson(listMobiles);       
        return jsonData;
    }


    @Override
    public void WriteToFile(String data, String filename) {
        try {
            FileOutputStream fileStream = new FileOutputStream(new File("E:\\DataCrawler\\" + filename + ".txt"));
            OutputStreamWriter myWriter = new OutputStreamWriter(fileStream, "UTF-8");
            myWriter.write(data);
            myWriter.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    @SuppressWarnings("unchecked")
    @Override
    public ArrayList<ProductModel> ReadToFile(String filename) {
        ArrayList<ProductModel> listMobiles = new ArrayList<>();
        JSONParser jsonParser = new JSONParser();
        try {
            BufferedReader buff = new BufferedReader(new InputStreamReader(new FileInputStream("E:\\DataCrawler\\" + filename + ".txt"), "UTF-8"));
            listMobiles = (ArrayList<ProductModel>) jsonParser.parse(buff);

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
        return listMobiles;
    }

    @Override
    public void DeleteFile(String filename) {
        File file = new File("E:\\DataCrawler" + filename + ".txt");
        file.delete();

    }



}
