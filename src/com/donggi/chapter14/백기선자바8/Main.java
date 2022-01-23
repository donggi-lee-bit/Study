package com.donggi.chapter14.백기선자바8;

public class Main {

    public static void main(String[] args) {
        Foo foo = new DefaultFoo("keesun");
        foo.printName();
        foo.printNameUpperCase();

        Foo.printAnything();
    }
}

