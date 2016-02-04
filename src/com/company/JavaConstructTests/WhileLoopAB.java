package com.company.JavaConstructTests;

import com.company.model.A;
import com.company.model.B;

/**
 * Created by WaiTuck on 05/02/2016.
 */
public class WhileLoopAB {
    public static void test(){
        while(new A() != new A()){
            B b = new B();
        }
    }
}
