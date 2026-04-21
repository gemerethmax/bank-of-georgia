package com.bankofgeorgia.core_banking.controller;

import java.util.logging.Logger;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.http.ResponseEntity;

import com.bankofgeorgia.core_banking.dto.CustomerRequestDTO;
import com.bankofgeorgia.core_banking.dto.CustomerResponseDTO;

import com.bankofgeorgia.core_banking.service.CustomerService;


@RestController
@CrossOrigin(origins = "http://localhost:3000") // Adjust the origin as needed
@RequestMapping("/api/customers")
public class CustomerController {

    Logger logger = Logger.getLogger(CustomerController.class.getName());

    public final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @PostMapping("/register")
    public ResponseEntity<CustomerRequestDTO> registerCustomer(@RequestBody CustomerRequestDTO customer) {
        logger.info("Registering new customer with email: " + customer.getEmail());
        CustomerResponseDTO registeredCustomer = customerService.registerCustomer(customer);
        return ResponseEntity.ok(registeredCustomer);
    }
}
