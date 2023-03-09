package org.example.seminar01.cw02;

import java.util.ArrayList;
import java.util.Arrays;

public class Example02 {
    /**
     * Сделать класс Товар абстрактным, создать нескольких наследников
     * (к примеру: БутылкаВоды), сделать интерфейсом ТорговыйАвтомат
     * и реализовать класс какого-то одного типа ТорговогоАвтомата (пример: ПродающийБутылкиВодыАвтомат)
     * <p>
     * Дополнительно:
     * 1. Попросить вначале переопределить метод toString для Товара, запустить программу,
     * после этого переопределить для наследника этот метод, после запуска обратить внимание на изменение поведения.
     * 2. Попросить создать перегруженный метод выдачи товара ТорговымАвтоматом
     * дополнив дополнительным входным параметром (пример: getProduct(String name)
     * выдающий товар по имени, создать метод возвращающий товар по имени и какому-либо параметру товара
     * getProduct(String name, int volume)
     *
     * @param args
     */
    public static void main(String[] args) {
        VMBottleOfWater vmBottleOfWater = new VMBottleOfWater();
        ArrayList<BottleOfWater> products = new ArrayList<>(Arrays.asList(new BottleOfWater("pepsi", 42),
                new BottleOfWater("fanta", 67),
                new BottleOfWater("cola", 70)));
        vmBottleOfWater.initProducts(products);
        System.out.println(vmBottleOfWater.getProductByName("cola"));
        System.out.println("Перегрузка метода (+цена): " + vmBottleOfWater.getProductByName("fanta", 67));
        System.out.println(vmBottleOfWater.getProductByCost(67));
    }
}
