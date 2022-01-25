package com.donggi.chapter13;

public class ThreadEx12 {

    public static void main(String[] args) {
        ThreadEx12_1 th1 = new ThreadEx12_1();
        ThreadEx12_2 th2 = new ThreadEx12_2();

        th1.start();
        th2.start();

        try {
            th1.sleep(2000);    // main 메서드가 영향받음. sleep()은 static 으로 선언되어 있으며 참조변수를 이용해서 호출하지 않고 Thread.sleep(2000) 과 같이 해야한다.
        } catch (InterruptedException e) {
        }

        System.out.print("<<main 종료>>");
    }
}

class ThreadEx12_1 extends Thread {
    public void run() {
        for (int i = 0; i < 300; i++) {
            System.out.print("-");
        }
        System.out.print("<<th1 종료>>");
    }
}

class ThreadEx12_2 extends Thread {
    public void run() {
        for (int i = 0; i < 300; i++) {
            System.out.print("|");
        }
        System.out.print("<<th2 종료>>");
    }
}