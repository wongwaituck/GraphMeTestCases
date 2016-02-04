package com.company.MethodSignatureTests;

import com.company.model.A;
import com.company.model.B;

/**
 * Created by WaiTuck on 05/02/2016.
 */
public class AReturnsTypeB {
    public static B test(){
        return new A().getInstanceB();
    }
}
