package com.donggi.chapter14.백기선자바8;

public interface Foo {

    void printName();

    /**
     * @implSpec
     * 이 구현체는 getName()으로 가져온 문자열을 대문자로 바꿔 출력한다.
     */
    default void printNameUpperCase() {
        System.out.println(getName().toUpperCase());
    }

    /**
     * @implSpec
     * 구현체에 대한 설명을 이렇게 써주는거구나 임플스펙
     */
    default void printNameLowerCase() {
        System.out.println(getName().toLowerCase());
    }

    String getName();

    static void printAnything() {
        System.out.println("Foo");
    }

    static void anotherThings() {
        System.out.println("스태틱 메서드를 여러개 인터페이스에");
    }
}
