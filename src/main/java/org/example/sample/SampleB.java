package org.example.sample;

import org.example.test.TestA;

public class SampleB extends TestA {
    public void invoke(){
        testAPublic();
        testProtected();
        // testPrivate();
        // testAPure();
    }
}
