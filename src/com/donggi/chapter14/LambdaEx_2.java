package com.donggi.chapter14;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class LambdaEx_2 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        Stream<Integer> intStream = list.stream();

        intStream.forEach(System.out::println);
        System.out.println("=============");

        Stream<String> strStream = Stream.of("a", "b", "c");
        Stream<String> strStream2 = Stream.of(new String[]{"a", "b", "c"});
        Stream<String> strStream3 = Arrays.stream(new String[]{"a", "b", "c"});
        Stream<String> strStream4 = Arrays.stream(new String[]{"a", "b", "c"}, 0, 3);

        strStream.forEach(System.out::println);
        System.out.println("=============");
        strStream2.forEach(System.out::println);
        System.out.println("=============");
        strStream3.forEach(System.out::println);
        System.out.println("=============");
        strStream4.forEach(System.out::println);
        System.out.println("=============");

    }
}
