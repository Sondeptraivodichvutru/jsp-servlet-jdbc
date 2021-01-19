package com.laptrinhjavaweb.dao;

import java.util.List;

import com.laptrinhjavaweb.model.UserModel;
import com.laptrinhjavaweb.paging.Pageble;

public interface IUserDAO extends GenericDAO<UserModel> {

    UserModel findByUserNameAndPasswordAndStatus(String userName, String password, Integer status);
    
    List<UserModel> findAll();
    
    UserModel findOne(String id);
    
    int getTotalItem();

    String save(UserModel newUser);

    void update(UserModel updateUser);

    void delete(String id);

	List<UserModel> takeAll(Pageble pageble);
}
