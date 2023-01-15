package com.spring.mvc.services;

import java.util.List;

import com.spring.mvc.entity.User;

public interface UserServices {
	public User createUser(User user);
	public List<User> findAllUser();
	public User findById(int id);
	public Boolean updateUser(User user);
	public Boolean deleteUser(int id);
}
