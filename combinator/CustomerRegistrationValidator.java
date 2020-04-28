package com.company.functionalprogrammingpattern.combinator;

import java.time.LocalDate;
import java.util.function.Function;

public interface CustomerRegistrationValidator extends Function<Customer, CustomerRegistrationValidator.ValidationResult> {

    static CustomerRegistrationValidator isEmailValid() {
        return customer -> customer.getEmail().contains("@") ? ValidationResult.SUCCESS : ValidationResult.EMAIL_NOT_VALID;
    }

    static CustomerRegistrationValidator isPhoneNumberValid() {
        return customer -> customer.getEmail().contains("+0") ? ValidationResult.SUCCESS : ValidationResult.PHONE_NUMBER_NOT_VALID;
    }

    static CustomerRegistrationValidator isDateOfBirthValid() {
        return customer -> customer.getDob().isBefore(LocalDate.now()) ? ValidationResult.SUCCESS : ValidationResult.IS_NOT_BORN;
    }

    default CustomerRegistrationValidator and (CustomerRegistrationValidator other) {
         return customer -> {
            ValidationResult validationResult = this.apply(customer);
            return validationResult.equals(ValidationResult.SUCCESS) ? other.apply(customer): validationResult;
         };
    }

    enum ValidationResult {
        SUCCESS,
        PHONE_NUMBER_NOT_VALID,
        EMAIL_NOT_VALID,
        IS_NOT_BORN
    }
}
