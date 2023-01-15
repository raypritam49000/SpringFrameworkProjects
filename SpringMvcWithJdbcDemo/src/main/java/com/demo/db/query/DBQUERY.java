package com.demo.db.query;

public class DBQUERY {
	public static final String INSERT_USER = "insert into user (name,city,email,mobile) values (?,?,?,?)";
	public static final String FIND_USER_BY_ID = "select * from user where id=?";
	public static final String FIND_USERS = "select * from user";
	public static final String DELETE_USER = "delete from user where id=?";
	public static final String FIND_ALL_USER_BY_ID = "select * from user where id=?";
	public static final String UPDATE_USER_BY_ID = "update user set name=?,city=?,email=?,mobile=? where id = ?";

}