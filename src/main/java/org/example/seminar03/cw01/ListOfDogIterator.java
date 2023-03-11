package org.example.seminar03.cw01;

import java.util.Iterator;
import java.util.List;

public class ListOfDogIterator implements Iterator<Dog> {
    private List<Dog> dogsIterator;
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
