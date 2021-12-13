package com.donggi.chapter11;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Ex11_13 {

    public static void main(String[] args) {
        Set set = new TreeSet();    // 2. TreeSet이 비교 기준을 가지고 있던지 둘 중에 하나는 있어야한다
//        Set set = new HashSet();

//        for (int i = 0; set.size() < 6; i++) {
//            int num = (int) (Math.random() * 45) + 1;
            set.add(new Test());    // 1. 추가되는 객체가 비교 기준을 가지고있던지.
            set.add(new Test());
            set.add(new Test());
            set.add(new Test());
            set.add(new Test());
            set.add(new Test());
//        }
        System.out.println(set);

    }
}

class Test implements Comparable {
    @Override
    public int compareTo(Object o) {
        return -1;
    }    // 비교 기준이 없음


}

class TestComp implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        return 1;
    }
}
