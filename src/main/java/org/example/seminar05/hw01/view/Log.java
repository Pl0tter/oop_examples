package org.example.seminar05.hw01.view;

import java.util.ArrayList;
import java.util.List;

public class Log {
    private List<String> log = new ArrayList<>();

    public void addLog(String a, String b, int action, String result) {
        log.add("Первое число: " + a + "\tВторое число: " + b + "\tДействие: " + action + "\tРезультат: " + result);
    }

    public void print() {
        System.out.println("---История ввода---");
        for (String item : log) {
            System.out.println(item);
        }
    }
}
