package org.example.seminar01.hw01;

public class HotDrink extends Product {
    private int temp;

    public HotDrink(String name, double cost, int volume, int temp) {
        super(name, cost, volume);
        this.temp = temp;
    }

    public HotDrink(String name) {
        this(name, 0, 0, 0);
    }

    public int getTemp() {
        return temp;
    }

    public void setTemp(int temp) {
        this.temp = temp;
    }

    @Override
    public String toString() {
        return "HotDrink{" +
                "name='" + name + '\'' +
                ", cost=" + cost +
                ", volume=" + volume + ", temp=" + temp +
                '}';
    }
}
