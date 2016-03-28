package com.szasza.service;

import com.szasza.entity.Product;

/**
 * Created by szasza on 2016. 02. 06..
 */
public interface IProductService {

    Iterable<Product> listAllProducts();

    Product getProductById(Integer id);

    Product saveProduct(Product product);

    void deleteProduct(Integer id);
}
