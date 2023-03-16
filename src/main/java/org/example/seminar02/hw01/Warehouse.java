package org.example.seminar02.hw01;

import java.util.ArrayList;
import java.util.List;

public class Warehouse implements WarehouseBehavior {
    private List<Food> wh = new ArrayList<>();

    public Warehouse(List<Food> wh) {
        this.wh = wh;
    }

    @Override
    public void add(Food item) {
        this.wh.add(item);
    }

    @Override
    public List<Food> filterBy(String key, Object value) {
        List<Food> listResult = new ArrayList<>();
        for (Food product : wh) {
            switch (key) {
                case ("name"):
                    if (product.getName().toLowerCase().contains((CharSequence) value)) {
                        listResult.add(product);
                    }
                    break;
                case ("grade"):
                    if (product.getGrade() == value) {
                        listResult.add(product);
                    }
                    break;
            }
        }
        return listResult;
    }

    @Override
    public List<Food> maxPrice() {
        List<Food> listResult = new ArrayList<>();
        int max = 0;
        for (Food product : wh) {
            if (product.getPrice() > max) max = product.getPrice();
        }
        for (Food product : wh) {
            if (product.getPrice() == max) listResult.add(product);
        }
        return listResult;
    }

    @Override
    public List<Food> minPrice() {
        List<Food> listResult = new ArrayList<>();
        int min = wh.get(0).getPrice();
        for (int i = 1; i < wh.size(); i++) {
            if (wh.get(i).getPrice() < min) min = wh.get(i).getPrice();
        }
        for (Food product : wh) {
            if (product.getPrice() == min) listResult.add(product);
        }
        return listResult;
    }
}
