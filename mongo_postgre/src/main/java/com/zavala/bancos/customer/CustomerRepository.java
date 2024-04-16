package com.zavala.bancos.customer;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * 
 * @author Ramiro
 *
 */
@Repository
public interface CustomerRepository extends CrudRepository<Customer, Long> {}
