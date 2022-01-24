package com.donggi.chapter14.백기선자바8;

public class DefaultFoo implements Foo, Bar {

    String name;

    public DefaultFoo(String name) {
        this.name = name;
    }

    @Override
    public void printNameLowerCase() {
        System.out.println(this.name.toLowerCase());
    }

    @Override
    public void printNameUpperCase() {
        System.out.println(this.name.toUpperCase());
    }

    @Override
    public void printName() {
        System.out.println(this.name);
    }

    @Override
    public String getName() {
        return this.name;
    }
}
