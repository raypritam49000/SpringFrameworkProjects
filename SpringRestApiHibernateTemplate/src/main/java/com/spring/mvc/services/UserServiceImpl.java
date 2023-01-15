package com.spring.mvc.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.mvc.dao.UserDao;
import com.spring.mvc.entity.User;

@Service
public class UserServiceImpl implements UserServices {

	@Autowired
	private UserDao userDao;

	@Override
	public User createUser(User user) {
		return userDao.createUser(user);
	}

	@Override
	public List<User> findAllUser() {
		return userDao.findAllUser();
	}

	@Override
	public User findById(int id) {
		return userDao.findById(id);
	}

	@Override
	public Boolean updateUser(User user) {
		return userDao.updateUser(user);
	}

	@Override
	public Boolean deleteUser(int id) {
		return userDao.deleteUser(id);
	}

}