package com.company.functionalprogrammingpattern.combinator;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("shubham", "shubham@gmail.com", "+09738992167", LocalDate.ofYearDay(2000, 1));
//        CustomerValidatorService customerValidatorService = new CustomerValidatorService();
//        customerValidatorService.isValidCustomer(customer);

        System.out.println(CustomerRegistrationValidator.isEmailValid().and(CustomerRegistrationValidator.isDateOfBirthValid().and(CustomerRegistrationValidator.isPhoneNumberValid())));
    }
}
