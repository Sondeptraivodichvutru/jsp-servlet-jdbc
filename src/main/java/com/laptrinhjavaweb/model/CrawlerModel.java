package com.laptrinhjavaweb.model;


public class CrawlerModel extends AbstractModel<CrawlerModel>{
	private String filename;
	private String link;
	
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	public String getFilename() {
		return filename;
	}
	public void setFilename(String filename) {
		this.filename = filename;
	}
	
	
}
