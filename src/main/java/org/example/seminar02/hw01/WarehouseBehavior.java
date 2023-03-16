package org.example.seminar02.hw01;

import java.util.List;

public interface WarehouseBehavior {
    void add(Food item);

    List<Food> filterBy(String key, Object value);

    List<Food> maxPrice();

    List<Food> minPrice();
}
