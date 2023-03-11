package org.example.seminar03.cw01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListOfDogs implements Iterable<Dog>{
    private List<Dog> dogs = new ArrayList<>();

    public ListOfDogs(List<Dog> dogs) {
        this.dogs = dogs;
    }

    @Override
    public Iterator<Dog> iterator() {
        return new ListOfDogIterator(dogs);
    }

}
