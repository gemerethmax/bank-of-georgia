package com.bankofgeorgia.core_banking.service;

import java.util.logging.Logger;

import com.bankofgeorgia.core_banking.dto.OtpRequestDTO;
import com.bankofgeorgia.core_banking.dto.OtpResponseDTO;

import org.springframework.stereotype.Service;

@Service
public class AuthService {
    Logger logger = Logger.getLogger(AuthService.class.getName());

    public OtpResponseDTO requestOtp(OtpRequestDTO otpRequest) {
        logger.info("Processing OTP request for phone number: " + otpRequest.getPhoneNumber());
        // Implementing OTP request logic here
        return new OtpResponseDTO("OTP requested successfully", otpRequest.getPhoneNumber(), "true", "300");
    }

}
