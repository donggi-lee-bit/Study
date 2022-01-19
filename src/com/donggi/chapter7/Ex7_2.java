package com.donggi.chapter7;

public class Ex7_2 {

    public static void main(String[] args) {
        Child c = new Child();
        c.method();

        System.out.println("==============");

//        Point p = new Point();
        Point3D p = new Point3D();
        System.out.println(p.getLocation());
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
    int x;
    int y;

    String getLocation() {
        return "x :" + x + ", y :" + y;
    }
}

class Point3D extends Point {
    int z;
    String getLocation() {
        return super.getLocation() + ", z :" + z;
    }
}


