package com.company.JavaConstructTests;

import com.company.model.*;

/**
 * Created by WaiTuck on 05/02/2016.
 */
public class IfElse {
    public void test(){
        if(new A() != new A()){
            B b = new B();
        } else if (new C() != new C()) {
            D d = new D();
        } else {
            E e = new E();
        }
    }
}
