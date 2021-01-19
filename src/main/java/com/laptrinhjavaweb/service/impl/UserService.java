package com.laptrinhjavaweb.service.impl;

import java.util.List;

import com.laptrinhjavaweb.dao.IUserDAO;
import com.laptrinhjavaweb.dao.impl.UserDAO;
import com.laptrinhjavaweb.model.UserModel;
import com.laptrinhjavaweb.paging.Pageble;
import com.laptrinhjavaweb.service.IUserService;

public class UserService implements IUserService {

    private IUserDAO userDAO;

    public UserService() {
        userDAO = new UserDAO();
    }

    @Override
    public UserModel findByUserNameAndPasswordAndStatus(String userName, String password, Integer status) {
        return userDAO.findByUserNameAndPasswordAndStatus(userName, password, status);
    }

	@Override
	public List<UserModel> findAll() {
		 return userDAO.findAll();
	}

	@Override
	public List<UserModel> takeAll(Pageble pageble) {
		return userDAO.takeAll(pageble);
	}

	@Override
	public UserModel findOne(String id) {
		UserModel user = userDAO.findOne(id);
        return user;
	}

	@Override
	public int getTotalItem() {
		return userDAO.getTotalItem();
	}

	@Override
	public UserModel save(UserModel insert) {
		String id = userDAO.save(insert);
        return userDAO.findOne(id);
	}

	@Override
	public UserModel update(UserModel update) {
		userDAO.update(update);
        return userDAO.findOne(update.getId());
	}

	@Override
	public void delete(String[] ids) {
		for (String id : ids) {
			userDAO.delete(id);
        }
	}

}
