package org.example.seminar01.cw02;

public class BottleOfWater extends Product {

    public BottleOfWater(String name, double cost) {
        super(name, cost);
    }

    @Override
    public String toString() {
        return "Это переопределение метода для бутылки воды: BottleOfWater{" +
                "name='" + name + '\'' +
                ", cost=" + cost +
                '}';
    }
}
