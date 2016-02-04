package com.company.JavaConstructTests;

import com.company.model.A;
import com.company.model.B;

/**
 * Created by WaiTuck on 05/02/2016.
 */
public class ForEachLoop {
    public static void test(){
        for(A a: new A[2]){
            B b = a.getInstanceB();
        }
    }
}
