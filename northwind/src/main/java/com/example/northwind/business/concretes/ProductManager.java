package com.example.northwind.business.concretes;

import com.example.northwind.business.abstracts.ProductService;
import com.example.northwind.core.utilities.results.DataResult;
import com.example.northwind.core.utilities.results.Result;
import com.example.northwind.core.utilities.results.SuccessDataResult;
import com.example.northwind.dataAccess.abstracts.ProductDao;
import com.example.northwind.entities.concretes.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductManager implements ProductService {

   // injection
    private ProductDao productDao;


    //bu annotions projede buna karşılık gelebilcek product daonun instance olabilcek bir sınıfı niteler
    @Autowired
    public ProductManager(ProductDao productDao) {
        super();
        this.productDao = productDao;
    }


    @Override
    public DataResult<List<Product>> getAll() {

        return new SuccessDataResult<List<Product>>(
                this.productDao.findAll(),"Data listelendi"
        );
    }

    @Override
    public Result add(Product product) {
        this.productDao.save(product);
        return new SuccessDataResult("Ürün eklendi");
    }
}
