package com.laptrinhjavaweb.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import com.laptrinhjavaweb.model.CrawlerModel;

public class CrawlerMapper implements RowMapper<CrawlerModel>{

	@Override
	public CrawlerModel mapRow(ResultSet rs) {
		 try {
			 CrawlerModel file = new CrawlerModel();
			 file.setId(rs.getString("id"));
			 file.setFilename(rs.getString("filename"));
			 file.setLink(rs.getString("link"));
			 file.setCreatedDate(rs.getTimestamp("createddate"));		 
	            return file;
	        } catch (SQLException e) {
	            return null;
	        }
	}

}
