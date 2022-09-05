package com.demo.services;

import java.util.List;

import com.demo.entity.User;

public interface UserServices {
	public abstract int saveUser(User user);
	public abstract User getUserById(int id);
	public abstract List<User> getAllUsersById(int id);
	public int deleteUserById(int id);
	public List<User> findAll();
	public int updateUser(User user);
}
