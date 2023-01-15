package net.codejava.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import net.codejava.dbquery.DatabaseQuery;
import net.codejava.models.Customer;

public interface CustomerMapper {

	@Select(DatabaseQuery.FIND_CUSTOMERS)
	public abstract List<Customer> findAll();

	@Select(DatabaseQuery.FIND_CUSTOMER_BY_ID)
	public abstract Customer findById(int id);

	@Delete(DatabaseQuery.DELETE_CUSTOMER)
	public abstract void delete(int id);

	@Update(DatabaseQuery.UPDATE_CUSTOMER)
	public abstract int updateCustomer(Customer customer);

	@Insert(DatabaseQuery.CREATE_CUSTOMERS)
	public abstract int saveCustomer(Customer customer);
}