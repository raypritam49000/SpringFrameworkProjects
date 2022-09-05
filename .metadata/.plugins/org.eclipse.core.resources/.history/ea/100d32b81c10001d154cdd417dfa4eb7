package net.codejava.customer;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

//public interface CustomerRepository extends CrudRepository<Customer, Long> {
//
//	@Query(value = "SELECT c FROM Customer c WHERE c.name LIKE '%' || :keyword || '%'"
//			+ " OR c.email LIKE '%' || :keyword || '%'" + " OR c.address LIKE '%' || :keyword || '%'")
//	public List<Customer> search(@Param("keyword") String keyword);
//}

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

	@Query(value = "SELECT c FROM Customer c WHERE c.name LIKE '%' || :keyword || '%'"
			+ " OR c.email LIKE '%' || :keyword || '%'" + " OR c.address LIKE '%' || :keyword || '%'")
	public List<Customer> search(@Param("keyword") String keyword);
	
//	@Query("SELECT p FROM Customer p WHERE CONCAT(p.name, p.city, p.mobile, p.email) LIKE %?1%")
//	public List<Customer> search(@Param("keyword") String keyword);
}