package com.longlvq.services;

import java.util.List;

import com.longlvq.models.User;

public interface UserService {
	List<User> getListUser();
	User getUser();
	int addUser();
	int editUser();
	int blockUser();
	User getUser(int id);
}
