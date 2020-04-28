package com.company.functionalprogrammingpattern.imperative;

import java.util.function.Predicate;

public class _Predicate {
    public static void main(String[] args) {
        System.out.println(isPhoneNumberValid("07999099343"));
        System.out.println(isPhoneNumberValid("0799999343"));
        System.out.println(pred.test("07999099343"));
        System.out.println(pred.or(pred1).test("09999099343"));
        System.out.println(pred.and(pred1).test("09999099343"));
    }

    static Predicate<String> pred = s -> s.startsWith("07") && s.length() == 11;
    static Predicate<String> pred1 = s -> s.startsWith("09") && s.length() == 11;

    static boolean isPhoneNumberValid(String phoneNumber) {
        return phoneNumber.startsWith("07") && phoneNumber.length() == 11;
    }
}
