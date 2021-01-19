package com.laptrinhjavaweb.dao.impl;

import java.util.List;

import org.apache.commons.lang.StringUtils;

import com.laptrinhjavaweb.dao.ICrawlerDAO;
import com.laptrinhjavaweb.mapper.CrawlerMapper;
import com.laptrinhjavaweb.model.CrawlerModel;
import com.laptrinhjavaweb.paging.Pageble;

public class CrawlerDAO extends AbstractDAO<CrawlerModel> implements ICrawlerDAO {

	@Override
	public int getTotalItem() {
		String sql = "SELECT count(*) FROM crawlerInfor";
		return count(sql);
	}

	@Override
	public List<CrawlerModel> findAll(Pageble pageble) {
		StringBuilder sql = new StringBuilder("SELECT * FROM crawlerInfor");
		if (pageble.getSorter() != null && StringUtils.isNotBlank(pageble.getSorter().getSortName())
				&& StringUtils.isNotBlank(pageble.getSorter().getSortBy())) {
			sql.append(" ORDER BY " + pageble.getSorter().getSortName() + " " + pageble.getSorter().getSortBy() + "");
		}
		if (pageble.getOffset() != null && pageble.getLimit() != null) {
			sql.append(" LIMIT " + pageble.getOffset() + ", " + pageble.getLimit() + "");
		}
		return query(sql.toString(), new CrawlerMapper());

	}

	@Override
	public String save(CrawlerModel crawlerModel) {
		StringBuilder sql = new StringBuilder("INSERT INTO crawlerInfor (filename, link,createddate)");
		sql.append(" VALUES(?, ?,CURRENT_TIMESTAMP)");
		return insert(sql.toString(), crawlerModel.getFilename(), crawlerModel.getLink());
	}

	@Override
	public void update(CrawlerModel crawlerModel) {
		StringBuilder sql = new StringBuilder("UPDATE crawlerInfor SET filename = ?");
		sql.append(" WHERE id = ?");
		update(sql.toString(), crawlerModel.getFilename(), crawlerModel.getId());

	}

	@Override
	public void delete(String id) {
		String sql = "DELETE FROM crawlerInfor WHERE id = ?";
        update(sql, id);

	}

	@Override
	public CrawlerModel findOne(String id) {
		String sql = "SELECT * FROM crawlerInfor WHERE id = ?";
		List<CrawlerModel> crawler = query(sql, new CrawlerMapper(), id);
		return crawler.isEmpty() ? null : crawler.get(0);
	}

}
