package com.company.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by WaiTuck on 05/02/2016.
 */
public class DummyGeneric<T> {
    List<T> t;

    public DummyGeneric(){
        t = new ArrayList<>();
    }

}
