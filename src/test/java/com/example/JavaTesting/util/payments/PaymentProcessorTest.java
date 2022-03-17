package com.example.JavaTesting.util.payments;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class PaymentProcessorTest {

    @Test
    public void payment_is_correct(){
        PaymentGateway gateway = Mockito.mock(PaymentGateway.class);
        Mockito.when(gateway.requestPayment(Mockito.any()))
                .thenReturn(new PaymentResponse(PaymentResponse.paymentStatus.OK));

        PaymentProcessor paymentProcessor = new PaymentProcessor(gateway);

        assertTrue(paymentProcessor.makePayment(1000));
    }


    @Test
    public void payment_is_incorrect(){
        PaymentGateway gateway = Mockito.mock(PaymentGateway.class);
        Mockito.when(gateway.requestPayment(Mockito.any()))
                .thenReturn(new PaymentResponse(PaymentResponse.paymentStatus.ERROR));

        PaymentProcessor paymentProcessor = new PaymentProcessor(gateway);

        assertFalse(paymentProcessor.makePayment(1000));
    }

}