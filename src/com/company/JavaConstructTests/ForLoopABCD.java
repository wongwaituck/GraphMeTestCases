package com.company.JavaConstructTests;

import com.company.model.A;
import com.company.model.B;
import com.company.model.C;
import com.company.model.D;

/**
 * Created by WaiTuck on 05/02/2016.
 */
public class ForLoopABCD {
    public static void test(){
        for(A a = new A(); a.getInstanceB() != new B(); new C()){
            D d = new D();
        }
    }
}
