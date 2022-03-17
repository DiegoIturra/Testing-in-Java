package com.example.JavaTesting.util.payments;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class PaymentProcessor {

    private PaymentGateway gateway;

    public boolean makePayment(double amount){
        PaymentResponse response = gateway.requestPayment(new PaymentRequest(amount));
        return response.getStatus().equals(PaymentResponse.paymentStatus.OK);
    }
}
