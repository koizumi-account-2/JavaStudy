package org.example.test;

public class TestB {
    public void invoke(){
        TestA testA = new TestA();
        testA.testAPublic();
        testA.testAPure();
        testA.testProtected();
        // testA.testPrivate();
    }
}
