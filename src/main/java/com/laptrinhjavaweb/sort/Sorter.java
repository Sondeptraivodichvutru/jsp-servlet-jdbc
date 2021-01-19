package com.laptrinhjavaweb.sort;

public class Sorter {

	private String sortName;
	private String sortBy;
	private int status;

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public Sorter(String sortName, String sortBy, int status) {
		this.sortName = sortName;
		this.sortBy = sortBy;
		this.status = status;
	}

	public String getSortName() {
		return sortName;
	}

	public void setSortName(String sortName) {
		this.sortName = sortName;
	}

	public String getSortBy() {
		return sortBy;
	}

	public void setSortBy(String sortBy) {
		this.sortBy = sortBy;
	}
}
