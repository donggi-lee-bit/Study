package com.donggi.chapter6;

public class Ex6_4 {
    public static void main(String[] args) {
        MyMath mm = new MyMath();
        long result = mm.max(5, 3);
        long result0 = mm.min(5, 3);
        long result1 = mm.add(5L, 3L);
        long result2 = mm.subtract(5L, 3L);
        long result3 = mm.multiply(5L, 3L);
        double result4 = mm.divide(5L, 3L);
        mm.printGugudan(6);

        System.out.println("min(5, 3) = " + result0);
        System.out.println("max(5, 3) = " + result);
        System.out.println("add(5L, 3L) = " + result1);
        System.out.println("subtract(5L, 3L) = " + result2);
        System.out.println("multiply(5L, 3L) = " + result3);
        System.out.println("divide(5L, 3L) = " + result4);
    }
}

class MyMath {

    void printGugudan(int dan) {
        if (!(2 <= dan && dan <= 9)) {
            return; // 입력받은 dan이 2~9가 아니면, 메서드 종료하고 돌아감
        }
        for (int i = 1; i <= 9; i++) {
            System.out.printf("%d * %d = %d%n", dan, i, dan * i);
        }
//        return ;
    }

    long add(long a, long b) {
        if (a > b) {
            return a; // 조건식이 참일때만 실행
        } else {
            return b; // 조건식이 거짓일때만 실행
        }
        // return a + b;        // 위의 두 줄을 이와 같이 한 줄로 간단히 할 수 있다.
    }

    long min(long a, long b) {
        return a < b ? a : b;
    }

    long max(long a, long b) {
        return a > b ? a : b;
    }

    long subtract(long a, long b) {
        return a - b;
    }

    long multiply(long a, long b) {
        return a * b;
    }

    double divide(double a, double b) {
        return a / b;
    }
}
