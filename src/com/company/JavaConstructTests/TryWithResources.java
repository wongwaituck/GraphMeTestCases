package com.company.JavaConstructTests;

import com.company.model.A;
import com.company.model.B;
import com.company.model.DummyCloseable;

import java.io.IOException;

/**
 * Created by WaiTuck on 05/02/2016.
 */
public class TryWithResources {
    public static void test(){
        try(DummyCloseable dumm = new DummyCloseable()){
            A a = new A();
        } catch (IOException e) {
            e.printStackTrace();
            B b = new B();
        }
    }
}
