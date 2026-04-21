package com.bankofgeorgia.core_banking.dao;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import java.util.logging.Logger;


public class CustomerMongoRepository {
    Logger logger = Logger.getLogger(CustomerMongoRepository.class.getName());

    private final BCryptPasswordEncoder passwordEncoder;

    public CustomerMongoRepository(@Value("${bcrypt.strength:10}") int bcryptStrength) {
        this.passwordEncoder = new BCryptPasswordEncoder(bcryptStrength);
    }

    
}
