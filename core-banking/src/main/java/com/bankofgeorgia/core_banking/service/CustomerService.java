package com.bankofgeorgia.core_banking.service;

import com.bankofgeorgia.core_banking.dto.CustomerRequestDTO;
import com.bankofgeorgia.core_banking.dto.CustomerResponseDTO;
import com.bankofgeorgia.core_banking.entity.Customer;
import com.bankofgeorgia.core_banking.repository.CustomerDao;
import com.bankofgeorgia.core_banking.config.SecurityConfig;


import java.util.logging.Logger;

public class CustomerService {
    Logger logger = Logger.getLogger(CustomerService.class.getName());

    private final BCryptPasswordEncoder passwordEncoder;

    private final CustomerDao customerDao;

    public CustomerService(CustomerDao customerDao, BCryptPasswordEncoder passwordEncoder) {
        this.customerDao = customerDao;
        this.passwordEncoder = passwordEncoder;
    }

    public CustomerResponseDTO registerCustomer(CustomerRequestDTO customerRequest) {
        logger.info("Registering customer with email: " + customerRequest.getEmail());
       
        Customer customer = new Customer();
        customer.setFirstName(customerRequest.getFirstName());
        customer.setLastName(customerRequest.getLastName());
        customer.setEmail(customerRequest.getEmail());
        customer.setUsername(customerRequest.getUsername());
        customer.setPhone(customerRequest.getPhone());
        customer.setPassword(passwordEncoder.encode(customerRequest.getPassword())); 
        customer.setDateOfBirth(customerRequest.getDateOfBirth());

        Customer savedCustomer = customerDao.save(customer);

        CustomerResponseDTO responseDTO = new CustomerResponseDTO();
        // Map savedCustomer to responseDTO as needed
        return responseDTO;
    }


}
