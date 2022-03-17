package com.example.JavaTesting.util.payments;

public interface PaymentGateway {

    PaymentResponse requestPayment(PaymentRequest request);

}
