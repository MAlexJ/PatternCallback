package com.malex.callback.service;

import com.malex.callback.Operation;
import com.malex.callback.impl.DefaultOperation;

import java.util.List;

public class Template {

    private Operation callback;

    public Template() {
        this.callback = new DefaultOperation();
    }

    public void setCallback(Operation callback) { //TODO: this method -> variable method Callback
        this.callback = callback;
    }

    public void processData(List<String> lines) {
        for (String line : lines) {

            line = callback.evaluate(line); //TODO: здесь мы будем передавать контроль над обработкой пользователю

            System.out.println("Operation result : " + line);
        }
    }
}
