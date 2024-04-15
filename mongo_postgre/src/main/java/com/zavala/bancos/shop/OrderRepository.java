package com.zavala.bancos.shop;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * 
 * @author Ramiro
 *
 */

@Repository
public interface OrderRepository extends CrudRepository<Order, String> {}