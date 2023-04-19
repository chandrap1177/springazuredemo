package com.motivity.springdatajpa.service;

import com.motivity.springdatajpa.entity.Product;
import com.motivity.springdatajpa.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

   public Product getProductByName(String name)
   {
       return productRepository.findByName(name);
   }


   public List<Product> saveAll(List<Product> products)
   {
       return productRepository.saveAll(products);
   }
   public List<Product> getAllProduct()
   {
       return productRepository.findAll();
   }

   public Optional<Product> getProductById(String id)
   {
       return productRepository.findById(id);
   }

    public Product save(Product product) {
       return productRepository.save(product);
    }
}
