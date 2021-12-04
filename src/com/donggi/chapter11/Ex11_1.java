package com.donggi.chapter11;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;

public class Ex11_1 {

    public static void main(String[] args) {
        // 기본 길이(용량, capacity)가 10인 ArrayList를 생성
        ArrayList list1 = new ArrayList(10);
        // ArrayList에는 객체만 저장 가능
        // autoboxing에 의해 기본형이 참조형으로 자동 변환
        list1.add(5);
//        list1.add(new Integer(5));
        list1.add(new Integer(4));
        list1.add(new Integer(2));
        list1.add(new Integer(0));
        list1.add(new Integer(1));
        list1.add(new Integer(3));

        ArrayList list2 = new ArrayList(list1.subList(1, 4));
        print(list1, list2);

        // Collection은 인터페이스, Collections는 유틸 클래스
        Collections.sort(list1);    // list1, list2를 정렬
        Collections.sort(list2);
        print(list1, list2);

        // containsAll() 메서드는 list1이 list2의 모든 요소를 포함하고 있는지 boolean으로 반환해준다
        System.out.println("list1.containsAll(list2) : " + list1.containsAll(list2));

        list2.add("B");
        list2.add("C");
        // add() 추가할 위치를 정해줄 수도 있다
        list2.add(3, "A");
        print(list1, list2);

        // list2의 3번째 index인 "A"를 "AA"로 치환
        list2.set(3, "AA");
        print(list1, list2);

        list1.add(0, "1");
        // indexOf() 로 문자열 1이 어디에 있는지 알 수 있다
        System.out.println("index = " + list1.indexOf("1"));
        // 숫자 5를 삭제하고 싶을 땐 new Integer(5);
        // 5번째 index를 삭제할 땐 remove(5);
        list1.remove(new Integer(1));
        print(list1, list2);

        // list1에서 list2와 겹치는 부분만 남기고 나머지는 삭제
        System.out.println("list1.retainAll(list2) : " + list1.retainAll(list2));
        print(list1, list2);

        // list2에서 list1에 포함된 객체들을 삭제
        for (int i = list2.size() - 1; i >= 0; i--) {
            if (list1.contains(list2.get(i))) {
                list2.remove(i);
            }
        }
        print(list1, list2);
    }

    static void print(ArrayList list1, ArrayList list2) {
        System.out.println("list1 : " + list1);
        System.out.println("list2 : " + list2);
        System.out.println();
    }
}
