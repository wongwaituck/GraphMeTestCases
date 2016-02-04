package com.company.JavaConstructTests;

import com.company.model.A;
import com.company.model.DummyException;

/**
 * Created by WaiTuck on 05/02/2016.
 */
public class TryCatch {
    public static void test(){
        try{
            DummyExceptionThrower.throwDummyException();
        } catch(DummyException e){
            A a = new A();
        }

    }


}
