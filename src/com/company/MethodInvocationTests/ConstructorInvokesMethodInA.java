package com.company.MethodInvocationTests;

import com.company.model.A;

/**
 * Created by WaiTuck on 05/02/2016.
 */
public class ConstructorInvokesMethodInA {
    public ConstructorInvokesMethodInA(){
        A.getB();
    }
}
