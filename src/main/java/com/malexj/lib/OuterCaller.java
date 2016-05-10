package com.malexj.lib;

public class OuterCaller {

    public void callFromOutsidePrivateMethod(IPrivateMethodCallback callback) {
        System.out.println("Outer method call");
        callback.callPrivateMethod("Outer caller");
    }
}
