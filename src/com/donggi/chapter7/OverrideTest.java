package com.donggi.chapter7;

class MyPoint3 extends Object{
    int x;
    int y;

    MyPoint3(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "x : " + x + ", y : " + y;
    }
}

public class OverrideTest {

    public static void main(String[] args) {
        MyPoint3 p = new MyPoint3(1, 2);
//        p.x = 3;
//        p.y = 5;
        System.out.println(p);
//        System.out.println(p.toString());
//        System.out.println("p.x = " + p.x);
//        System.out.println("p.y = " + p.y);
    }
}
