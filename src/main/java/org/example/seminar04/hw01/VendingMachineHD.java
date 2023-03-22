package org.example.seminar04.hw01;

import java.util.ArrayList;

public class VendingMachineHD<T extends HotDrink> implements IVendingMachineHD<T> {
    private ArrayList<T> drinks = new ArrayList<>();

    @Override
    public void initProducts(ArrayList<T> products) {
        this.drinks = products;
    }

    @Override
    public T getProduct(String name, int temp, int volume) {
        for (T drink : drinks) {
            if (drink.getName().equalsIgnoreCase(name) && drink.getVolume() == volume && drink.getTemp() == temp) {
                return drink;
            }
        }
        throw new IllegalStateException(String.format("Продукт c названием %s не найден.", name));
    }

    @Override
    public T getProduct(String name) {
        for (T drink : drinks) {
            if (drink.getName().equalsIgnoreCase(name)) return drink;
        }
        throw new IllegalStateException(String.format("Продукт c названием %s не найден.", name));
    }
}

