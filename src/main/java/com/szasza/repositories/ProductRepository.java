package com.szasza.repositories;

import com.szasza.entity.Product;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by szasza on 2016. 02. 05..
 */


public interface ProductRepository extends CrudRepository<Product, Integer> {

}
