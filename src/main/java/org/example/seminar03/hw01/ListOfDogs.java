package org.example.seminar03.hw01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListOfDogs implements Iterable<Dog> {
    private List<Dog> dogs;

    public ListOfDogs(List<Dog> dogs) {
        this();
        this.dogs.addAll(dogs);
    }

    public ListOfDogs() {
        dogs = new ArrayList<>();
    }

    public void add(Dog dogNew) {
        dogs.add(dogNew);
    }

    @Override
    public Iterator<Dog> iterator() {
        return new ListOfDogIterator(dogs);
    }

    public void sort() {
        dogs.sort(new DogsComparator());
    }

    public void sort(String criteria) {
        if (criteria.equalsIgnoreCase("weight")) {
            dogs.sort((d1, d2) -> Integer.compare(d1.getWeight(), d2.getWeight()));
        }
    }

    @Override
    public String toString() {
        return "ListOfDogs{" +
                "dogs=" + dogs +
                '}';
    }
}
