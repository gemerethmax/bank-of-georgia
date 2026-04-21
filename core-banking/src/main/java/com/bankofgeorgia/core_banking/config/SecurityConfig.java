package com.bankofgeorgia.core_banking.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
public class SecurityConfig {

    @Bean
        public BCryptPasswordEncoder passwordEncoder(@Value("${bcrypt.strength:10}") int strength) {
        return new BCryptPasswordEncoder(strength);
    }

}