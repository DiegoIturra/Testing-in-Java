package com.example.JavaTesting.util.payments;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class PaymentResponse {

    enum paymentStatus {
        OK, ERROR
    }

    private paymentStatus status;
}
