package com.malex.callback.impl;

import com.malex.callback.Operation;

public class MyCustomOperation implements Operation {

    public String evaluate(String input) {
        return "MY CUSTOM: " + input.toUpperCase() +" custom implementation";
    }

}