package com.leozeballos.fraud;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@AllArgsConstructor
public class FraudCheckHistoryService {

    private final FraudCheckHistoryRepository repository;

    public boolean isFraudulentCustomer(Integer customerId) {
        repository.save(
            FraudCheckHistory.builder()
                .customerId(customerId)
                .isFraudster(true)
                .createdAt(LocalDateTime.now())
                .build()
        );
        return false;
    }

}