package org.example.seminar05.hw01.view;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class View {
    Scanner scanner = new Scanner(System.in);

    public String getValue(String title) {
        System.out.printf("%s: ", title);
        return scanner.next();
    }

    public void print(String title, String value) {
        System.out.printf("%s: %s\n\n", title, value);
    }

    public int menuAction() {
        HashMap<Integer, String> menu = new HashMap<>(Map.of(
                1, "сложение",
                2, "вычитание",
                3, "умножение",
                4, "деление"));
        System.out.println("Выберите необходимое действие:");
        for (Integer item : menu.keySet()) {
            System.out.printf("%d: %s\n", item, menu.get(item));
        }
        System.out.print("Введите номер: ");
        return scanner.nextInt();
    }

    public int menuType() {
        HashMap<Integer, String> menu = new HashMap<>(Map.of(
                1, "целые числа",
                2, "рациональные числа"));
        System.out.println("\tВыберите тип чисел:");
        for (Integer item : menu.keySet()) {
            System.out.printf("\t%d: %s\n", item, menu.get(item));
        }
        System.out.print("\tВведите номер: ");
        return scanner.nextInt();
    }
}
