package com.company.JavaConstructTests;

/**
 * Created by WaiTuck on 05/02/2016.
 */
public class DependsOnInnerClass {
    public static void test(){
        OuterClass.InnerClass.getA();
    }
}
