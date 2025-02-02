package org.example.test;

public class TestA {
    public void testAPublic(){
        System.out.println("testAPublic");
    }

    void testAPure(){
        System.out.println("testAPure");
    }

    protected void testProtected(){
        System.out.println("testProtected");
    }

    private void testPrivate(){
        System.out.println("testPrivate");
    }

    public void invoke(){
        testAPublic();
        testAPure();
        testAPure();
        testPrivate();
    }
}
