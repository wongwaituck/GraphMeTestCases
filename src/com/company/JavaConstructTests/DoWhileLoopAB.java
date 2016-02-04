package com.company.JavaConstructTests;

import com.company.model.A;
import com.company.model.B;

/**
 * Created by WaiTuck on 05/02/2016.
 */
public class DoWhileLoopAB {
    public static void test(){
        do{
            A a = new A();
        } while(new B().equals(new B()));
    }
}
