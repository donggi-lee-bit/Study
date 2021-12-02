package com.donggi.chapter6;

class Car2 {
    String color;
    String gearType;
    int door;

    Car2() {    // Car2(String color, String gearType, int door)를 호출
        this("white", "auto", 4);
    }

    Car2(String color) {  // // Car2(String color, String gearType, int door)를 호출
        this(color, "auto", 4);
    }

    Car2(String color, String gearType, int door) {
        this.color = color;         // this가 붙은 쪽은 인스턴스 변수, 오른쪽은 지역변수이다
        this.gearType = gearType;
        this.door = door;
    }
}

public class Ex6_14 {

    public static void main(String[] args) {

    }
}
