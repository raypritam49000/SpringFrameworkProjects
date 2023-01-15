package com.demo.services;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.UserDao;
import com.demo.entity.User;

@Service
public class UserServiceImpl implements UserServices {
	private Logger logger = Logger.getLogger(UserServiceImpl.class);
	
	@Autowired
	private UserDao userDao;

	@Override
	public int saveUser(User user) {
		logger.info("===>>> Going to UserServiceImpl saveUser method : "+user);
		return this.userDao.saveUser(user);
	}

	@Override
	public User getUserById(int id) {
		logger.info("===>>> Going to UserServiceImpl getUserById method : id ["+id+"]");
		return this.userDao.getUserById(id);
	}

	@Override
	public List<User> getAllUsersById(int id) {
		logger.info("===>>> Going to UserServiceImpl getAllUsersById method : id ["+id+"]");
		return this.userDao.getAllUsersById(id);
	}

	@Override
	public int deleteUserById(int id) {
		logger.info("===>>> Going to UserServiceImpl deleteUserById method : id ["+id+"]");
		return this.userDao.deleteUserById(id);
	}

	@Override
	public List<User> findAll() {
		List<User> users = this.userDao.findAll();
		logger.info("===>>> Going to UserServiceImpl findAll method : "+users);
		return users;
	}

	@Override
	public int updateUser(User user) {
		logger.info("===>>> Going to UserServiceImpl updateUser method : "+user);
		return this.userDao.updateUser(user);
	}

}