package org.example.seminar02.hw01;

public class Food extends Product {
    private Integer grade;

    public Food(String name, String country, Double weight, Integer price, Integer grade) {
        super(name, country, weight, price);
        this.grade = grade;
    }

    public Integer getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", grade=" + grade +
                '}';
    }
}
