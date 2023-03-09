package org.example.seminar01.hw01;

public abstract class Product {
    protected String name;
    protected double cost;
    protected int volume;

    public Product(String name, double cost, int volume) {
        this.name = name;
        this.cost = cost;
        this.volume = volume;
    }

    public Product(String name, int volume) {
        this(name, 0, volume);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", cost=" + cost +
                ", volume=" + volume +
                '}';
    }
}
