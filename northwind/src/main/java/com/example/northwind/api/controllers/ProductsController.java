package com.example.northwind.api.controllers;

import com.example.northwind.business.abstracts.ProductService;
import com.example.northwind.entities.concretes.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/api/products" ,method = RequestMethod.GET)
public class ProductsController {


    private ProductService productService;

    @Autowired
    public ProductsController(ProductService productService) {
        super();
        this.productService = productService;
    }

    @GetMapping("/getall")
    public List<Product> getAll(){
        return this.productService.getAll();
    }
}
