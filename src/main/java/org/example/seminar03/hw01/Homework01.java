package org.example.seminar03.hw01;

import java.util.*;

public class Homework01 {
    /**
     * Создать класс Dog и добавить возможноность итерирования по нему
     * <p>
     * Добавить Comparable и/или Comparator к приложению, написанному на семинаре
     *
     * @param args
     */
    public static void main(String[] args) {
        Random r = new Random();
        ListOfDogs dogs = new ListOfDogs();
        for (int i = 1; i <= 5; i++) {
            dogs.add(new Dog("Dog #" + i, r.nextInt(1, 11), r.nextInt(1,16)));
        }
        Iterator<Dog> dogsIterator = dogs.iterator();
        while (dogsIterator.hasNext()) {
            System.out.println(dogsIterator.next());
        }

        System.out.println("Сортировка по умолчанию (по возрасту):");
        dogs.sort();
        for (Dog dog : dogs) {
            System.out.println(dog);
        }
        System.out.println("Сортировка по весу:");
        dogs.sort("weight");
        for (Dog dog : dogs) {
            System.out.println(dog);
        }
    }
}
