package com.example.learnso;

public class JNITest {
    static {
        System.loadLibrary("JniLib");
    }

    public native String getString();
}
