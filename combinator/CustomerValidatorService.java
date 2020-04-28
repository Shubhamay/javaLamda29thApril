package com.company.functionalprogrammingpattern.combinator;

import java.time.LocalDate;

public class CustomerValidatorService {
    private boolean isEmailValid(String email) {
        return email.contains("@");
    }
    private boolean isPhoneNumberValid(String phoneNumber) {
        return phoneNumber.contains("+0");
    }
    private boolean isDateOfBirthValid(LocalDate dob) {
        return dob.isBefore(LocalDate.now());
    }

    public boolean isValidCustomer(Customer customer) {
        return isEmailValid(customer.getEmail()) && isDateOfBirthValid(customer.getDob()) && isPhoneNumberValid(customer.getPhoneNumber());
    }
}
