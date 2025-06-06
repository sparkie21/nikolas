package com.mycompany.th20798;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
    }

    public void addProduct(String name, int quantity, double price) {
        Product p = new Product(name, quantity, price);
        products.add(p);
    }

    public List<Product> getProducts() {
        return products;
    }
}