package com.bankofgeorgia.notification_service.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class SmsNotificationRequest {
    private String phoneNumber;
    private String otpCode;

    public SmsNotificationRequest(String phoneNumber, String otpCode) {
        this.phoneNumber = phoneNumber;
        this.otpCode = otpCode;
    }
}
