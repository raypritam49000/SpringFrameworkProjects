package com.demo.dao;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.demo.db.query.DBQUERY;
import com.demo.entity.User;
import com.demo.services.UserServiceImpl;

@Repository
public class UserDaoImpl implements UserDao {
	private Logger logger = Logger.getLogger(UserServiceImpl.class);
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public int saveUser(User user) {
		logger.info("===>>> Going  UserDaoImpl saveUser method in Save User using DATABASE QUERY ["+DBQUERY.INSERT_USER+"] "+user);
		return jdbcTemplate.update(DBQUERY.INSERT_USER, user.getName(),user.getCity(), user.getEmail(), user.getMobile());
	}

	@Override
	public User getUserById(int id) {
		logger.info("===>>> Going  UserDaoImpl getUserById method in Find User By ID using DATABASE QUERY ["+DBQUERY.FIND_USER_BY_ID+"] id ["+id+"]");
		return jdbcTemplate.queryForObject(DBQUERY.FIND_USER_BY_ID, new BeanPropertyRowMapper<User>(User.class), new Object[] { id });
	}
	
	@Override
	public List<User> getAllUsersById(int id) {
		logger.info("===>>>  Going  UserDaoImpl getAllUsersById method in Find All User By ID using DATABASE QUERY ["+DBQUERY.FIND_ALL_USER_BY_ID+"] id ["+id+"]");
		return jdbcTemplate.query(DBQUERY.FIND_ALL_USER_BY_ID, new BeanPropertyRowMapper<User>(User.class), new Object[] { id });
	}
	
	@Override
	public int deleteUserById(int id){   
		logger.info("===>>> Going  UserDaoImpl deleteUserById method in Delete User By ID using DATABASE QUERY ["+DBQUERY.DELETE_USER+"] id ["+id+"]");
	    return jdbcTemplate.update(DBQUERY.DELETE_USER,id);    
	}    
	
	@Override
	public List<User> findAll() {
		List<User> users = jdbcTemplate.query(DBQUERY.FIND_USERS, new BeanPropertyRowMapper<User>(User.class));
		logger.info("===>>> Going  UserDaoImpl findAll method in Find All User using DATABASE QUERY ["+DBQUERY.FIND_USERS+"] "+users);
		return users;
	}
	
	@Override
	public int updateUser(User user) {
		logger.info("===>>> Update User using DATABASE QUERY ["+DBQUERY.UPDATE_USER_BY_ID+"] "+user);
		return jdbcTemplate.update(DBQUERY.UPDATE_USER_BY_ID, user.getName(),user.getCity(), user.getEmail(), user.getMobile(),user.getId());
	}


}
