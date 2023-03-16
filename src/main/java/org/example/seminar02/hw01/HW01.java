package org.example.seminar02.hw01;

import java.util.ArrayList;
import java.util.List;

public class HW01 {
    /**
     * 1. Дан массив записей: наименование товара, цена, сорт.
     * Найти наибольшую цену товаров 1го или 2го сорта среди товаров, название которых содержит «высший».
     * 2. Сведения о товаре состоят из наименования, страны-производителя, веса, цены, сорта.
     * Получить наименования товаров заданного сорта с наименьшей ценой.
     *
     * @param args
     */
    public static void main(String[] args) {
        Warehouse wh = new Warehouse(List.of(new Food("Мука пшеничная", "Белоруссия", 1.0, 90, 2),
                new Food("Мука пшеничная, вЫсший сорт", "РФ", 1.0, 120, 1),
                new Food("Макароны", "Казахстан", 0.9, 80, 2),
                new Food("Говядина тушеная, высшиЙ сорт", "РФ", 0.2, 80, 3),
                new Food("Хлеб 'Высший вкус'", "РФ", 0.1, 40, 1)));
        List<Food> result = new ArrayList<>();
        result = wh.filterBy("grade", 1);
        result.addAll(wh.filterBy("grade", 2));
        result.retainAll(wh.filterBy("name", "высший"));
        System.out.println("Товары с наибольшей ценой товаров 1го или 2го сорта среди товаров, название которых содержит «высший»:\n" + new Warehouse(result).maxPrice());
        result.clear();
        result = wh.filterBy("grade", 1);
        System.out.println("Наименования товаров заданного сорта с наименьшей ценой:\n" + new Warehouse(result).minPrice());
    }
}
