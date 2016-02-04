package com.company.model;

import java.io.Closeable;
import java.io.IOException;

/**
 * Created by WaiTuck on 05/02/2016.
 */
public class DummyCloseable implements Closeable{

    @Override
    public void close() throws IOException {
        //do nothing
    }
}
