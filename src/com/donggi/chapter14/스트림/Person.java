package com.donggi.chapter14.스트림;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Person {
    private String name;
    private int age;
    private String phoneNumber;

    public Person(String name, int age, String phoneNumber) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("짱구", 23, "010-1234-1234"));
        personList.add(new Person("유리", 24, "010-2341-1334"));
        personList.add(new Person("철수", 29, "010-1414-5134"));
        personList.add(new Person("맹구", 25, null));

        Map<String, Person> personMap = personList.stream()
                .collect(Collectors.toMap(Person::getName, Function.identity()));
    }
}
