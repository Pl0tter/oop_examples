package org.example.seminar01.hw01;

import java.util.ArrayList;
import java.util.Arrays;

public class Homework01 {
    /**
     * 1. Создать наследника реализованного класса ГорячийНапиток с дополнительным полем int температура.
     * 2. Создать класс ГорячихНапитковАвтомат реализующий интерфейс ТорговыйАвтомат и
     * реализовать перегруженный метод getProduct(int name, int volume, int temperature)
     * выдающий продукт соответствующий имени, объему и температуре
     * 3. В main проинициализировать несколько ГорячихНапитков и ГорячихНапитковАвтомат и
     * воспроизвести логику заложенную в программе
     * 4. Все вышеуказанное создать согласно принципам ООП пройдённым на семинаре
     * @param args
     */
    public static void main(String[] args) {
        HotDrinksMachine machineHT = new HotDrinksMachine();
        ArrayList<HotDrink> drinks = new ArrayList<>(Arrays.asList(new HotDrink("black tea", 50,200,90),
                new HotDrink("green tea", 50,200,85),
                new HotDrink("latte", 120,300,80),
                new HotDrink("espresso", 100,100,90)));
        machineHT.initProducts(drinks);
        System.out.println(machineHT.getProduct("espresso"));
        System.out.println(machineHT.getProduct("green tea",200,85));
    }
}
