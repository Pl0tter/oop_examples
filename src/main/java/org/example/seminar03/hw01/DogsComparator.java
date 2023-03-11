package org.example.seminar03.hw01;

import java.util.Comparator;

public class DogsComparator implements Comparator<Dog> {
    @Override
    public int compare(Dog o1, Dog o2) {
//        return Integer.compare(o1.getAge(), o2.getAge());
        return o1.compareTo(o2);
    }
}
