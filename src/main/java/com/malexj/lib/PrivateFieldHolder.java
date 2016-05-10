package com.malexj.lib;

public class PrivateFieldHolder {
    private OuterCaller outerCaller;

    public OuterCaller getOuterCaller() {
        return outerCaller;
    }

    public void setOuterCaller(OuterCaller outerCaller) {
        this.outerCaller = outerCaller;
    }

    public void publicMethod() {
        System.out.println("Holder: public method call");

        // здесь хитрая штука: мы передаем в вызов метода
        // внешнего класса коллбэк, который
        // является анонимным классом внутри данного класса
        // т.к. этот анонимный класс видит private-метод, то мы
        // можем поместить внутрь callPrivateMethod вызов этого
        // private-метода. Таким образом, вызов
        // callPrivateMethod во внешнем классе позволит обратиться
        // к private-методу этого класса.
        outerCaller.callFromOutsidePrivateMethod(new IPrivateMethodCallback() {

            public void callPrivateMethod(String caller) {
                privateMethod(caller);
            }
        });

    }

    private void privateMethod(String caller) {
        System.out.println(caller + ": private method call");
    }

}
