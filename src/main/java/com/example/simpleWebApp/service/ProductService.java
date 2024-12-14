package com.example.simpleWebApp.service;


import com.example.simpleWebApp.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service

public class ProductService {

    List<Product> products = new ArrayList<>(Arrays.asList(
            new Product(101, "Iphone", 50000),
            new Product(102, "Canon Camera", 150000),
            new Product(103, "Shure", 10000)));

    public List<Product> getProducts(){
        return products;
    }

    public Product getProductsById(int prodId) {
        return products.stream()
                .filter(p -> p.getProdId() == prodId)
                .findFirst().orElse(new Product(100, "No item", 0));
    }

    public void addProduct(Product prod) {
//        System.out.println(prod);
        products.add(prod);
    }
}
