package net.codejava.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import net.codejava.entity.Customer;

@Repository
public interface CustomerRepository extends MongoRepository<Customer, String> {

}
