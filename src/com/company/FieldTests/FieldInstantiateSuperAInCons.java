package com.company.FieldTests;

import com.company.model.A;
import com.company.InheritanceTests.SuperA;

/**
 * Created by WaiTuck on 05/02/2016.
 */
public class FieldInstantiateSuperAInCons {
    private SuperA sua;

    public FieldInstantiateSuperAInCons(){
        sua = new A();
    }
}
