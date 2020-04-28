package com.company.functionalprogrammingpattern.imperative;

import java.util.ArrayList;
import java.util.List;
import java.util.function.*;

public class Main {

    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("John", Gender.MALE),
                new Person("Jane ", Gender.FEMALE),
                new Person("Maria ", Gender.FEMALE),
                new Person("Alica ", Gender.FEMALE),
                new Person("Alex ", Gender.MALE)
        );

        //Imperative apprach
        List<Person> females = new ArrayList<>();
        for(Person person : people) {
            if (Gender.FEMALE.equals(person.gender)) {
                females.add(person);
            }
        }

        for(Person person : females) {
            if (Gender.FEMALE.equals(person.gender)) {
                System.out.println(person);
            }
        }

        //Declarative approach
        Predicate<Person> predicate = person -> person.gender == Gender.FEMALE;
        people.stream().filter(predicate)
                .forEach(System.out::println);
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
        MALE, FEMALE
    }
}
