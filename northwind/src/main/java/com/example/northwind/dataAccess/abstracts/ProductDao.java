package com.example.northwind.dataAccess.abstracts;

import com.example.northwind.entities.concretes.Product;
import org.springframework.data.jpa.repository.JpaRepository;



public interface ProductDao extends JpaRepository<Product,Integer> {

}
