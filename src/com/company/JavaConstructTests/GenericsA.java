package com.company.JavaConstructTests;

import com.company.InheritanceTests.SuperA;
import com.company.InheritanceTests.SuperSuperA;
import com.company.model.A;
import com.company.model.DummyGeneric;

/**
 * Created by WaiTuck on 05/02/2016.
 */
public class GenericsA {
    public static void test(){
        DummyGeneric<A> dumbgenerics = new DummyGeneric<>();
        DummyGeneric<? super SuperA> dumbgenericSuperA = new DummyGeneric<>();
        DummyGeneric<? extends SuperSuperA> dumbgenericSuperSuperA = new DummyGeneric<>();
    }
}
