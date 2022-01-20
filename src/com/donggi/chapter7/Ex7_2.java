package com.donggi.chapter7;

public class Ex7_2 {

    public static void main(String[] args) {
        Child c = new Child();
        c.method();

        System.out.println("==============");

//        Point p = new Point();
//        Point3D p = new Point3D();
//        System.out.println(p.getLocation());
    }
}

class Parent {
    int x = 10;

    void parentMethod() {

    }
}

class Child extends Parent{
    int x = 20;

    void parentMethod() {   // 오버라이딩

    }

    void parentMethod(int i) {  // 오버로딩

    }

    void childMethod() {}
    void childMethod(int i) {}  // 오버로딩
//    void childMethod() {} // -> 에러. 중복 정의.

    void method() {
       System.out.println("x=" + x);
        System.out.println("this.x=" + this.x);
        System.out.println("super.x=" + super.x);
    }
}

class Point {
    int x = 10;
    int y = 20;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class Point3D extends Point {
    int z = 30;

    Point3D() {
        this(100, 200, 300);
    }

    Point3D(int x, int y, int z) {
        super(x, y);    // Point(int x, int y)를 호출한다.
        this.z = z;
    }
}


