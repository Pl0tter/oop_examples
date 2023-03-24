package org.example.seminar05.hw01.controller;

import org.example.seminar05.hw01.model.*;
import org.example.seminar05.hw01.view.Log;
import org.example.seminar05.hw01.view.View;

public class Controller {
    private View view;
    private Log log;
    private BaseCalc model;

    public Controller() {
        this.view = new View();
        this.log = new Log();
    }

    public void start() {
        int choiceAction = view.menuAction();
        switch (choiceAction) {
            case 1:
                this.model = new SumCalc();
                break;
            case 2:
                this.model = new SubCalc();
                break;
            case 3:
                this.model = new MultiCalc();
                break;
            case 4:
                this.model = new DivCalc();
                break;
            default:
                view.print("Нет такого пункта", "");
                break;
        }
        int choiceType = view.menuType();
        model.setNumType(choiceType);
        String a = view.getValue("Введите первое число (рациональные через /)");
        String b = view.getValue("Введите второе число (рациональные через /)");
        model.setA(a);
        model.setB(b);
        String result = model.result();
        view.print("Результат", result);
        log.addLog(a, b, choiceAction, result);
    }
    public void viewLog() {
        log.print();
    }


}
