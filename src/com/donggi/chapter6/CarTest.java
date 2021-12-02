package com.donggi.chapter6;

class Car {
    String color;
    String gearType;
    int door;

    Car() {
        this("white", "auto", 4);
    }

    Car(String c, String g, int d) { // 매개변수가 있는 생성자
        color = c;
        gearType = g;
        door = d;
    }
}

public class CarTest {

    public static void main(String[] args) {
        Car c = new Car("white", "auto", 4); // 아래 세 줄을 여기 한 줄로 할 수 있다
//        c.color = "white";
//        c.gearType = "auto";
//        c.door = 4;
    }
}
