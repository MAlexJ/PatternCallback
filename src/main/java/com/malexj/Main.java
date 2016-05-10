package com.malexj;

import com.malexj.lib.OuterCaller;
import com.malexj.lib.PrivateFieldHolder;

public class Main {

    public static void main(String[] args) {
        PrivateFieldHolder pfh = new PrivateFieldHolder();
        OuterCaller oc = new OuterCaller();
        pfh.setOuterCaller(oc);
        pfh.publicMethod();
    }

}
