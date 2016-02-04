package com.company.model;

import com.company.InheritanceTests.SuperA;

/**
 * Created by WaiTuck on 05/02/2016.
 */
public class A extends SuperA {
    public static B getB(){
        return new B();
    }

    public B getInstanceB(){
        return new B();
    }

    public B getInstanceBBasedOnD(D d){
        return new B();
    }
}
