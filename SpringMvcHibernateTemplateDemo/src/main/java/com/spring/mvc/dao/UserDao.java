package com.spring.mvc.dao;

import java.util.List;
import com.spring.mvc.entity.User;

public interface UserDao {
public User createUser(User user);
public List<User> findAllUser();
public User findById(int id);
public Boolean updateUser(User user);
public Boolean deleteUser(int id);
}
