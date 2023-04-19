package com.motivity.springdatajpa.repository;

import com.motivity.springdatajpa.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;

public interface ProductRepository extends JpaRepository<Product, Serializable> {

    Product findByName(String name);

}
