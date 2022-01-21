package com.example.northwind.entities.concretes;

import lombok.Data;

import javax.persistence.*;


@Entity
@Table(name="products")
public class Product {

    @Id
    @GeneratedValue
    @Column(name = "product_id")
    private int id;

    @Column(name = "category_Id")
    private int categoryId;

    @Column(name = "product_name")
    private String productName;

    @Column(name = "unit_Price")
    private double unitPrice;

    @Column(name = "units_In_Stock")
    private short unitsInStock;

    @Column(name = "quantity_Per_Unit")
    private String quantityPerUnit;

    public Product(int id, int categoryId, String productName, double unitPrice, short unitsInStock, String quantityPerUnit) {
        this.id = id;
        this.categoryId = categoryId;
        this.productName = productName;
        this.unitPrice = unitPrice;
        this.unitsInStock = unitsInStock;
        this.quantityPerUnit = quantityPerUnit;
    }

    public Product() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public short getUnitsInStock() {
        return unitsInStock;
    }

    public void setUnitsInStock(short unitsInStock) {
        this.unitsInStock = unitsInStock;
    }

    public String getQuantityPerUnit() {
        return quantityPerUnit;
    }

    public void setQuantityPerUnit(String quantityPerUnit) {
        this.quantityPerUnit = quantityPerUnit;
    }
}
