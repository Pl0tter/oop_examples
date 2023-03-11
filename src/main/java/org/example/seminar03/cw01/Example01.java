package org.example.seminar03.cw01;

import java.util.Arrays;
import java.util.Iterator;

public class Example01 {
    /**
     * Создать класс Dog и добавить возможноность итерирования по нему
     * @param args
     */
    public static void main(String[] args) {
        ListOfDogs dogs = new ListOfDogs(Arrays.asList(new Dog("Bob"),new Dog("Bib"),new Dog("Pip")));
        Iterator<Dog> dogsIterator = dogs.iterator();
        while(dogsIterator.hasNext()){
            System.out.println(dogsIterator.next().getName());
        }
    }
}
