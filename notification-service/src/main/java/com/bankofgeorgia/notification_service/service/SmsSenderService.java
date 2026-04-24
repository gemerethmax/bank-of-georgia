package com.bankofgeorgia.notification_service.service;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

@Service
public class SmsSenderService {

    Logger logger = Logger.getLogger(SmsSenderService.class.getName());

    @Value("${twilio.account.sid}")
    private String twilioAccountSid;

    @Value("${twilio.auth.token}")
    private String twilioAuthToken;

    @Value("${twilio.phone.number}")
    private String twilioPhoneNumber;



    public void sendSms(String phoneNumber, String otpCode) {
        // Simulate sending SMS by logging the message
        Twilio.init(twilioAccountSid, twilioAuthToken); 

            Message message = Message.creator(
                    new PhoneNumber(phoneNumber),
                    new PhoneNumber(twilioPhoneNumber),
                    "Your OTP code is " + otpCode
            ).create();

        logger.info("OTP Sent to " + phoneNumber + " | Twilio SID: " + message.getSid());
    }
    
}
