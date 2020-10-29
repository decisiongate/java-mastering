package test;

import patterns.Singleton;

import static org.junit.jupiter.api.Assertions.*;

class SingletonTest {

    @org.junit.jupiter.api.Test
    void getInstanceTest() {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        assertTrue(s1.hashCode()==s2.hashCode(),"s1 is NOT the same as s2");
    }
}