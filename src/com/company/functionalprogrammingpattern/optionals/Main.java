package com.company.functionalprogrammingpattern.optionals;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Integer a = null;
        int b = Optional.ofNullable(a)
                .orElseGet(() -> 1);

        Optional.ofNullable(a)
                .ifPresent(value -> {
                    System.out.println(value);
                });

        Optional.ofNullable(a)
                .ifPresentOrElse(value -> {
                    System.out.println(value);
                }, () -> System.out.println("Error"));

        Optional.ofNullable(b)
                .ifPresent(System.out::println);

        System.out.println(b);
    }
}
