package com.company.functionalprogrammingpattern.streams;

import com.company.functionalprogrammingpattern.imperative.Main;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class _Stream {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("John", Gender.MALE),
                new Person("Jane ", Gender.FEMALE),
                new Person("Maria ", Gender.FEMALE),
                new Person("Alica ", Gender.FEMALE),
                new Person("Alex ", Gender.MALE),
                new Person("Dupli ", Gender.TRANS_GENDER)
        );

        people.stream()
                .filter(person -> person.name.startsWith("A"))
                .collect(Collectors.toList());

        people.stream()
                .map(person -> person.gender)
                .collect(Collectors.toSet())
                .forEach(System.out::println);

        people.stream()
                .map(person -> person.name)
                .mapToInt(String::length)
                .forEach(System.out::println);

        Predicate<Person> predicate = (person) -> person.name.startsWith("A");

        System.out.println(people.stream()
                .anyMatch(predicate));

        System.out.println(people);
    }

    static class Person {
        private final String name;
        private final Gender gender;

        public Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person {" +
                    "name=" + name +
                    "gender=" + gender +
                    "}";
        }
    }

    enum Gender {
        MALE, FEMALE, TRANS_GENDER
    }
}
