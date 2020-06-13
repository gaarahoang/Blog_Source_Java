package com.longlvq.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.longlvq.dao.UserDAO;
import com.longlvq.models.User;

public class UserServiceImpl implements UserService {
	@Autowired
	public UserDAO userdao;
	@Override
	public List<User> getListUser() {
		return userdao.getListUser();
	}
	@Override
	public
	User getUser(int id) {
		return userdao.getUser();
	}
	@Override
	public User getUser() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public int addUser() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int editUser() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int blockUser() {
		// TODO Auto-generated method stub
		return 0;
	}
}
