package com.donggi.chapter14.백기선자바8;

public interface Bar {

    default void printNameUpperCase() {
        System.out.println("BAR");
    }
}
