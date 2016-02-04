package com.company.JavaConstructTests;

import com.company.model.DummyException;

/**
 * Created by WaiTuck on 05/02/2016.
 */
public class DummyExceptionThrower {
    public static void throwDummyException() throws DummyException {
        throw new DummyException();
    }
}
