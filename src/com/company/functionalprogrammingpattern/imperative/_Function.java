package com.company.functionalprogrammingpattern.imperative;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {
    public static void main(String[] args) {
        int increment = increment(0);
        System.out.println(increment);

        int increment1 = Increment.apply(0);
        System.out.println(increment1);

        int increment2 = multBy1o.apply(2);
        System.out.println(increment2);

        int increment3 = Increment.andThen(multBy1o).apply(2);
        System.out.println(increment3);

        //BiFunction
        int biFunc1 = biFunc.apply(1, 15);
        System.out.println(biFunc1);
    }

    static Function<Integer, Integer> Increment = number -> ++number;

    static Function<Integer, Integer> multBy1o = number -> number * 10;

    static int increment(int number) {
        return  ++number;
    }

    static BiFunction<Integer, Integer, Integer> biFunc = (a, b) -> a * b;
}
