package com.malex.callback.impl;

import com.malex.callback.Operation;

public class DefaultOperation implements Operation {

    public String evaluate(String input) {
        return "DEFAULT: " + input;
    }

}