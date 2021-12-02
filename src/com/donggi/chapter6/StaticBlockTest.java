package com.donggi.chapter6;

public class StaticBlockTest {
    static int[] arr = new int[10];  // 간단 초기화

    static {                           // static { }, 복잡 초기화를 하기 위해 사용된다
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 10) + 1;
        }
    }
}
