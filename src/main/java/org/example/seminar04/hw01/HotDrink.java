package org.example.seminar04.hw01;

public class HotDrink extends Product {
    private int temp;
    private int volume;

    public HotDrink(String name, int cost, int volume, int temp) {
        super(name, cost);
        this.volume = volume;
        this.temp = temp;
    }

    @Override
    public String toString() {
        return "HotDrink{" +
                "temp=" + temp +
                ", volume=" + volume +
                ", name='" + name + '\'' +
                ", cost=" + cost +
                '}';
    }

    public int getTemp() {
        return temp;
    }

    public int getVolume() {
        return volume;
    }
}
