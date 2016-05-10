package com.malex.init;

import com.malex.callback.impl.MyCustomOperation;
import com.malex.callback.service.Template;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Template template = new Template();
        List<String> data = Arrays.asList("firstLine", "secondLiNe");
        System.out.println("************ DefaultOperation  ***********");
        template.processData(data);

        System.out.println("************ MyCustomOperation  ***********");
        template.setCallback(new MyCustomOperation());
        template.processData(data);
    }

}
