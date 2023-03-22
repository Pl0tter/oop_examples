package org.example.seminar04.hw01;

import java.util.ArrayList;
import java.util.Arrays;

public class Homework01 {
    /**
     * Взять за основу первое ДЗ и добавить параметризацию (Создать единый вендинговый аппарат)
     * ВАЖНО!
     * Если используете интерфейсы, то нужно реализовывать именно их методы, а не писать собственные с тем же именем
     *
     * @param args
     */
    public static void main(String[] args) {
        VendingMachine<Product> machineMix = new VendingMachine<>();
        ArrayList<Product> products = new ArrayList<>(Arrays.asList(new HotDrink("black tea", 50, 200, 90),
                new Snacks("cake", 80, 200),
                new Snacks("chocolate", 70, 150),
                new HotDrink("espresso", 100, 100, 90)));
        machineMix.initProducts(products);
        System.out.println(machineMix.getProduct("espresso"));
        System.out.println(machineMix.getProduct("chocolate"));


        VendingMachineHD<HotDrink> machineHD = new VendingMachineHD<>();
        ArrayList<HotDrink> drinks = new ArrayList<>(Arrays.asList(new HotDrink("black tea", 50, 200, 90),
                new HotDrink("green tea", 50, 200, 85),
                new HotDrink("latte", 120, 300, 80),
                new HotDrink("espresso", 100, 100, 90)));
        machineHD.initProducts(drinks);
        System.out.println(machineHD.getProduct("latte"));
        System.out.println(machineHD.getProduct("green tea", 85, 200));
    }
}
