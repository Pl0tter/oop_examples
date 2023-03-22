package org.example.seminar04.hw01;

public class Snacks extends Product {
    private int weight;

    public Snacks(String name, int cost, int weight) {
        super(name, cost);
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Snacks{" +
                "weight=" + weight +
                ", name='" + name + '\'' +
                ", cost=" + cost +
                '}';
    }
}

