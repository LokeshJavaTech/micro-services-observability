package com.lokesh.microservices.fraudetect.controller;

import com.lokesh.microservices.fraudetect.service.FraudDetectionService;
import com.lokesh.microservices.fraudetect.entity.LoanStatus;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fraud")
@RequiredArgsConstructor
public class FraudDetectionController {

    private final FraudDetectionService fraudDetectionService;
    @GetMapping("/check")
    public LoanStatus checkForFraud(@RequestParam int customerId) {
        return fraudDetectionService.checkForFraud(customerId);
    }
}
