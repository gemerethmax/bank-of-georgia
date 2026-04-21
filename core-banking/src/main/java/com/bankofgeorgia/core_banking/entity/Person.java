package com.bankofgeorgia.core_banking.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Person {
    private String firstName;
    private String lastName;
    private String email;
    private String username;
    private String phone;
    private String passwordHash;
    private String dateOfBirth; 

    public Person(String firstName, String lastName, String email, String username, String phone, String passwordHash, String dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.username = username;
        this.phone = phone;
        this.passwordHash = passwordHash;
        this.dateOfBirth = dateOfBirth;
    }
}



