package com.bankofgeorgia.core_banking.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OtpRequestDTO {
    
    private String phoneNumber;

    public OtpRequestDTO(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
