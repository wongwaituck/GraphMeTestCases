package com.company.JavaConstructTests;

import com.company.model.A;

/**
 * Created by WaiTuck on 05/02/2016.
 */
public class OuterClass {
    public static class InnerClass {
        public static A getA() {
            return new A();
        }
    }

}
