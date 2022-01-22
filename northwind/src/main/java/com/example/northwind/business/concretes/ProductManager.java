package com.example.northwind.business.concretes;

import com.example.northwind.business.abstracts.ProductService;
import com.example.northwind.dataAccess.abstracts.ProductDao;
import com.example.northwind.entities.concretes.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductManager implements ProductService {

   //ı injection
    private ProductDao productDao;


    //bu annotions projede buna karşılık gelebilcek product daonun instance olabilcek bir sınıfı niteler
    @Autowired
    public ProductManager(ProductDao productDao) {
        super();
        this.productDao = productDao;
    }


    @Override
    public List<Product> getAll() {
        return this.productDao.findAll();
    }
}
