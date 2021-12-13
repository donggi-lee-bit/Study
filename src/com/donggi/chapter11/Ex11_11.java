package com.donggi.chapter11;

import java.util.HashSet;
import java.util.Objects;

public class Ex11_11 {
    public static void main(String[] args) {
        HashSet set = new HashSet();

        set.add("abc");
        set.add("abc");
        set.add(new Person("David", 10));
        set.add(new Person("David", 10));

        System.out.println(set);

    }
}

class Person {
    String name;
    int age;

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) return false;
        Person p = (Person) obj;
        return age == p.age && this.name.equals(p.name);
    }

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return name + ":" + age;
    }
}
