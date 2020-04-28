package com.company.functionalprogrammingpattern.imperative;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {
    public static void main(String[] args) {
        greetCustomer(new Customer("Anusua", "9999"));

        //Functional Interface
        consumer.accept(new Customer("Anusua", "9999"));
        Biconsumer.accept(new Customer("Anusua", "9999"),
                new Customer("Shubham", "8888"));
    }

    static void greetCustomer(Customer customer) {
        System.out.println("Hello " + customer.customerName + " " + customer.customerPhoneNumber);
    }

    static Consumer<Customer> consumer = customer -> {
        System.out.println("Hello " + customer.customerName + " " + customer.customerPhoneNumber);
    };

    static BiConsumer<Customer, Customer> Biconsumer = (customer, customer1) -> {
        System.out.println("Hello " + customer.customerName + " " + customer.customerPhoneNumber);
        System.out.println("Hello " + customer1.customerName + " " + customer1.customerPhoneNumber);
    };

    static class Customer {
        private final String customerName;
        private final String customerPhoneNumber;

        public Customer(String customerName, String customerPhoneNumber) {
            this.customerName = customerName;
            this.customerPhoneNumber = customerPhoneNumber;
        }
    }
}
