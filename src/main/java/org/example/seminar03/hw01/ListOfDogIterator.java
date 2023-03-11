package org.example.seminar03.hw01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListOfDogIterator implements Iterator<Dog> {
    private List<Dog> dogsIterator = new ArrayList<>();
    private int count = 0;

    public ListOfDogIterator(List<Dog> dogsIterator) {
        this.dogsIterator = dogsIterator;
    }

    @Override
    public boolean hasNext() {
        return count < dogsIterator.size();
    }

    @Override
    public Dog next() {
        return dogsIterator.get(count++);
    }
}
