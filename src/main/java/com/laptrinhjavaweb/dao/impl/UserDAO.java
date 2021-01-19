package com.laptrinhjavaweb.dao.impl;

import java.util.List;

import com.laptrinhjavaweb.dao.IUserDAO;
import com.laptrinhjavaweb.mapper.UserMapper;
import com.laptrinhjavaweb.model.UserModel;
import com.laptrinhjavaweb.paging.Pageble;

public class UserDAO extends AbstractDAO<UserModel> implements IUserDAO {

	@Override
	public UserModel findByUserNameAndPasswordAndStatus(String userName, String password, Integer status) {
		StringBuilder sql = new StringBuilder("SELECT * FROM user AS u");
		sql.append(" INNER JOIN role AS r ON r.id = u.roleid");
		sql.append(" WHERE username = ? AND password = ? AND status = ?");
		List<UserModel> users = query(sql.toString(), new UserMapper(), userName, password, status);
		return users.isEmpty() ? null : users.get(0);
	}

	@Override
	public List<UserModel> findAll() {
		String sql = "SELECT * FROM user";
		return query(sql, new UserMapper());
	}

	@Override
	public UserModel findOne(String id) {
		String sql = "SELECT * FROM user WHERE id = ?";
		List<UserModel> user = query(sql, new UserMapper(), id);
		return user.isEmpty() ? null : user.get(0);
	}

	@Override
	public int getTotalItem() {
		String sql = "SELECT count(*) FROM user";
		return count(sql);
	}

	@Override
	public String save(UserModel newUser) {
		StringBuilder sql = new StringBuilder("INSERT INTO user (username, password, fullname, status,roleid)");
		sql.append(" VALUES(?, ?, ?, ?, ?)");
		return insert(sql.toString(), newUser.getUserName(), newUser.getPassword(), newUser.getFullName(),
				newUser.getStatus(), newUser.getRoleId());
	}

	@Override
	public void update(UserModel updateCate) {
		StringBuilder sql = new StringBuilder("UPDATE user SET password = ?, fullname = ?, status=?, roleid=?");
		sql.append(" WHERE id = ?");
		update(sql.toString(), updateCate.getPassword(), updateCate.getFullName(), updateCate.getId(),
				updateCate.getStatus(), updateCate.getRoleId(), updateCate.getId());
	}

	@Override
	public void delete(String id) {
		String sql = "DELETE FROM category WHERE id = ?";
		update(sql, id);
	}

	@Override
	public List<UserModel> takeAll(Pageble pageble) {
		// TODO Auto-generated method stub
		return null;
	}

}
