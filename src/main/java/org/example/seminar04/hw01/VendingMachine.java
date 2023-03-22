package org.example.seminar04.hw01;

import java.util.ArrayList;

public class VendingMachine<T extends Product> implements IVendingMachine<T> {
    private ArrayList<T> products = new ArrayList<>();

    @Override
    public void initProducts(ArrayList<T> products) {
        this.products = products;
    }

    @Override
    public T getProduct(String name) {
        for (T item : products) {
            if (item.getName().equalsIgnoreCase(name)) return item;
        }
        throw new IllegalStateException(String.format("Продукт c названием %s не найден.", name));
    }
}
