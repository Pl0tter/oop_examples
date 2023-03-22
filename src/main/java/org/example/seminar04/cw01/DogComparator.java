package org.example.seminar04.cw01;

import java.util.Comparator;

public class DogComparator implements Comparator<Dog> {
//    @Override
//    public int compare(Dog o1, Dog o2) {
//        return o1.compareTo(o2);
//    }

//    @Override
//    public int compare(Dog o1, Dog o2) {
//        return o1.getName().compareTo(o2.getName());
//    }
//

    @Override
    public int compare(Dog o1, Dog o2 ) {
        if (o1.getAge() < o2.getAge()){
            return 1;

        } else if (o1.getAge() > o2.getAge()) {
            return -1;

        }else {
            return 0;
        }
    }
}
