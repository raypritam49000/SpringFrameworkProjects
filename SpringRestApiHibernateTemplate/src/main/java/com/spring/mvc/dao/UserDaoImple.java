package com.spring.mvc.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.spring.mvc.entity.User;

@Repository
@Transactional
public class UserDaoImple implements UserDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;

	@Override
	public User createUser(User user) {
		return hibernateTemplate.get(User.class, hibernateTemplate.save(user));
	}

	@Override
	public List<User> findAllUser() {
		return hibernateTemplate.loadAll(User.class);
	}

	@Override
	public User findById(int id) {
		return hibernateTemplate.get(User.class, id);
	}

	@Override
	public Boolean updateUser(User user) {
		hibernateTemplate.saveOrUpdate(user);
		return true;
	}

	@Override
	public Boolean deleteUser(int id) {
		hibernateTemplate.delete(hibernateTemplate.get(User.class, id));
		return true;
	}

}