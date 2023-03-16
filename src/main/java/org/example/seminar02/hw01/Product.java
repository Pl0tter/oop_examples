package org.example.seminar02.hw01;

abstract class Product {
    private String name;
    private String country;
    private Double weight;
    private Integer price;

    public Product(String name, String country, Double weight, Integer price) {
        this.name = name;
        this.country = country;
        this.weight = weight;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", weight=" + weight +
                ", price=" + price;
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    public Double getWeight() {
        return weight;
    }

    public Integer getPrice() {
        return price;
    }
}
