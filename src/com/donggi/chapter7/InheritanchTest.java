package com.donggi.chapter7;

class MyPoint {
    int x;
    int y;
}

//class Circle extends MyPoint {    // 상속
//    int r;
//}

class Circle { // 포함
    MyPoint m = new MyPoint();
    int r;
}

public class InheritanchTest {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.m.x = 1;
        c.m.y = 3;
        c.r = 2;
        System.out.println("c.x = " + c.m.x);
        System.out.println("c.y = " + c.m.y);
        System.out.println("c.r = " + c.r);
    }
}
