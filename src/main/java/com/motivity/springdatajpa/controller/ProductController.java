package com.motivity.springdatajpa.controller;

import com.motivity.springdatajpa.entity.Product;
import com.motivity.springdatajpa.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
@Autowired
    private ProductService productService;
    @PostMapping("/save")
   @ResponseStatus(HttpStatus.CREATED)
    public Product saveProduct(@RequestBody Product product)
    {
        return productService.save(product);

    }

    @PostMapping("/saveAll")
    @ResponseStatus(HttpStatus.CREATED)
    public List<Product> saveAll(@RequestBody List<Product> listOfProducts)
    {
       return  productService.saveAll(listOfProducts);
    }
}
