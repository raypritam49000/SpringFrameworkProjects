package net.codejava.dbquery;

public class DatabaseQuery {
	public static final String FIND_CUSTOMERS = "select * from customer";
	public static final String FIND_CUSTOMER_BY_ID = "select * from customer where id = #{id}";
	public static final String DELETE_CUSTOMER = "delete from customer where id = #{id}";
	public static final String UPDATE_CUSTOMER = "update customer set name = #{name} , email = #{email}, address = #{address} where id = #{id}";
	public static final String CREATE_CUSTOMERS = "insert into customer(name,email,address) VALUES(#{name}, #{email},#{address})";
}
