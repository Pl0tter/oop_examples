package org.example.seminar04.cw01;

public class Cat {
    private String breed;
    private int weight;
    private boolean isInGoodMood;


    public Cat(String breed, int weight, boolean isInGoodMood) {
        this.breed = breed;
        this.weight = weight;
        this.isInGoodMood = isInGoodMood;

    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public boolean isInGoodMood() {
        return isInGoodMood;
    }

    public void setInGoodMood(boolean inGoodMood) {
        isInGoodMood = inGoodMood;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "breed='" + breed + '\'' +
                ", weight=" + weight +
                ", isInGoodMood=" + isInGoodMood +
                '}';
    }

//    @Override
//    public Iterator<Cat> iterator() {
//        return new CatHome(cats);
//    }
}
