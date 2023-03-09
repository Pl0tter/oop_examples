package org.example.seminar01.cw02;

import java.util.ArrayList;

public class VMBottleOfWater extends VendingMachine {
    ArrayList<BottleOfWater> products = new ArrayList<>();

    @Override
    void initProducts(ArrayList products) {
        this.products = products;
    }

    @Override
    BottleOfWater getProductByName(String name) {
        for (BottleOfWater p : products) {
            if (p.getName().equalsIgnoreCase(name)) return p;
        }
        return new BottleOfWater("Вода не найдена", 0);
    }

    BottleOfWater getProductByName(String name, double maxCost) {
        for (BottleOfWater p : products) {
            if (p.getName().equalsIgnoreCase(name) && p.getCost() <= maxCost) return p;
        }
        return new BottleOfWater("Вода не найдена", 0);
    }

    @Override
    BottleOfWater getProductByCost(double cost) {
        for (BottleOfWater p : products) {
            if (p.getCost() == cost) return p;
        }
        return new BottleOfWater("Вода не найдена", 0);
    }
}
