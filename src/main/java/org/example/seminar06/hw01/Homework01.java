package org.example.seminar06.hw01;

public class Homework01 {
    /**
     * Реализовать один из паттернов на выбор (singleton -https://habr.com/ru/post/129494/, builder, MVC)
     * @param args
     */
    public static void main(String[] args) {
        Car car = CarBuilder.getInstance().setVin(65656565).setModel("Camry").build();
        System.out.println(car);

        Car car2 = CarBuilder.getInstance().setVin(65656565).setOwner("Vladimir").setModel("Camry").setColor("black")
                .setEngine(EngineType.PETROL).build();
        System.out.println(car2);
    }
}
