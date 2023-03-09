package org.example.seminar01.cw01;

import java.util.ArrayList;

public class VendingMachine {
    private ArrayList<Product> products = new ArrayList<>();

    public void initProducts(ArrayList<Product> products) {
        this.products = products;
    }

    public Product getProductByName(String name) {
        for (Product p : products) {
            if (p.getName().equalsIgnoreCase(name)) return p;
        }
        return new Product("Продукт не найден", 0);
    }

    public Product getProductByCost(double cost) {
        for (Product p : products) {
            if (p.getCost() == cost) return p;
        }
        return new Product("Продукт не найден", 0);
    }
}
