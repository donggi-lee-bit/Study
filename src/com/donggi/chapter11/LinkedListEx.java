package com.donggi.chapter11;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class LinkedListEx {

    public static void main(String[] args) {
        List<String> list = new LinkedList();

        list.add("Geeks");
        list.add("for");
        list.add("Geeks");
        list.add("10");
        list.add("20");

        Collection<String> collect = new ArrayList<String>();
        collect.add("A");
        collect.add("Computer");
        collect.add("Portal");
        collect.add("for");
        collect.add("Geeks");

        System.out.println("The LinkedList is: " + list);
        list.addAll(1, collect);
        System.out.println("The new Linked list is: " + list);
    }
}
