package com.bankofgeorgia.notification_service.controller;

import java.util.logging.Logger;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;

import com.bankofgeorgia.notification_service.dto.SmsNotificationRequest;
import com.bankofgeorgia.notification_service.service.SmsSenderService;

@RestController
@RequestMapping("/api/notifications")
public class NotificationController {
    
    Logger logger = Logger.getLogger(NotificationController.class.getName());

    private final SmsSenderService smsSenderService;

    public NotificationController(SmsSenderService smsSenderService) {
        this.smsSenderService = smsSenderService;
    }

    @PostMapping("/sms")
    public void sendSmsNotification(@RequestBody SmsNotificationRequest request) {
        logger.info("Received SMS notification request for phone number: " + request.getPhoneNumber());
        smsSenderService.sendSms(request.getPhoneNumber(), request.getOtpCode());
    }
}
