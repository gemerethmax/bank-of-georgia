package com.bankofgeorgia.core_banking.entity;

public class Customer extends Person {

    public Customer(String firstName, String lastName, String email, String username, String phone, String passwordHash, String dateOfBirth) {
        super(firstName, lastName, email, username, phone, passwordHash, dateOfBirth);
    }
    
}
