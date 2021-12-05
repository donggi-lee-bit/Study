package com.donggi.chapter11;

import java.util.*;

public class Ex11_5 {

    public static void main(String[] args) {
        Collection c = new HashSet();   // Set은 Collection의 자손
//        Collection c = new TreeSet();
        c.add("1");
        c.add("2");
        c.add("3");
        c.add("4");
        c.add("5");

        Iterator it = c.iterator();

        while (it.hasNext()) {
            Object obj = it.next();
            System.out.println(obj);
        }

        // iterator는 일회용이라 쓰고나면 다시 얻어와야함
        it = c.iterator();   // 새로운 iterator 객체를 불러옴

        while (it.hasNext()) {
            Object obj = it.next();
            System.out.println(obj);
        }

//        for (int i = 0; i < list.size(); i++) { // collection framework 를 ArrayList에서 HashSet으로 바꾸게되면 HashSet에는 get이라는 method가 없기 때문에 해당 for loop는 사용하지 못하게 된다. 이것이 Iterator를 사용하는 이유이다
//            Object obj = list.get(i);
//            System.out.println(obj);
//        }
    }
}
