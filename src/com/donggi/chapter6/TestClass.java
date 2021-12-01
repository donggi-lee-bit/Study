package com.donggi.chapter6;

public class TestClass {
    void instanceMethod() {} // 인스턴스 메서드

    static void staticMethod() {} // static 메서드

    void instatnceMethod2() { // 인스턴스메서드
        instanceMethod();  // 다른 인스턴스 메서드를 호출한다. 된다
        staticMethod();  // static 메서드도 호출이 된다
    }

    static void staticMethod2() {  // static 메서드
//        instanceMethod();  // 에러. 인스턴스 메서드 호출 불가능
        staticMethod();    // static 메서드는 호출할 수 있다
    }
}
