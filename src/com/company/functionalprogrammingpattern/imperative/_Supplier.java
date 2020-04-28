package com.company.functionalprogrammingpattern.imperative;

import java.util.function.Supplier;

public class _Supplier {
    public static void main(String[] args) {
        System.out.println(getConnectionUrl()) ;
        System.out.println(getDBConnectionSupplier.get());
    }

    static String getConnectionUrl() {
        return "jdbc://ocalhost:5432/user";
    }

    static Supplier<String> getDBConnectionSupplier = ()
            -> "jdbc://ocalhost:5432/user";
}
