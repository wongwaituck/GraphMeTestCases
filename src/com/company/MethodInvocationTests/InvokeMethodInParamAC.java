package com.company.MethodInvocationTests;

import com.company.model.A;
import com.company.model.C;

/**
 * Created by WaiTuck on 05/02/2016.
 */
public class InvokeMethodInParamAC {
    public static void test(){
        new A().getInstanceBBasedOnD(C.getD());
    }
}
