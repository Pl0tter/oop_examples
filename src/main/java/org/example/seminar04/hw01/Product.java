package org.example.seminar04.hw01;

public abstract class Product {
    protected String name;
    protected int cost;

    public Product(String name, int cost) {
        this.name = name;
        this.cost = cost;
    }

    public Product(String name) {
        this(name, 0);
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", cost=" + cost +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getCost() {
        return cost;
    }
}
