package org.example.sample;

import org.example.test.TestA;

public class SampleA {
    public void invoke(){
        TestA testA = new TestA();
        testA.testAPublic();
        // testA.testAPure();
        // testA.testProtected();
        // testA.testPrivate();
    }
}
