package org.example.seminar01.hw01;

import java.util.ArrayList;

public class HotDrinksMachine extends VendingMachine {
    private ArrayList<HotDrink> drinks = new ArrayList<>();

    @Override
    void initProducts(ArrayList products) {
        this.drinks = products;
    }

    @Override
    Product getProduct(String name) {
        for (HotDrink drink : drinks) {
            if (drink.getName().equalsIgnoreCase(name)) return drink;
        }
        return new HotDrink("Напиток не найден");
    }

    Product getProduct(String name, int volume, int temp) {
        for (HotDrink drink : drinks) {
            if (drink.getName().equalsIgnoreCase(name) && drink.getVolume() == volume && drink.getTemp() == temp) {
                return drink;
            }
        }
        return new HotDrink("Напиток не найден");
    }
}
