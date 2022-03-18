package com.example.JavaTesting.util.payments;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class PaymentProcessorTest {

    private PaymentGateway gateway;
    private PaymentProcessor paymentProcessor;

    /*This method is executed before every method in this test Class*/
    @Before
    public void setup(){
        gateway = Mockito.mock(PaymentGateway.class);
        paymentProcessor = new PaymentProcessor(gateway);
    }

    @Test
    public void payment_is_correct(){
        Mockito.when(gateway.requestPayment(Mockito.any()))
                .thenReturn(new PaymentResponse(PaymentResponse.paymentStatus.OK));

        assertTrue(paymentProcessor.makePayment(1000));
    }


    @Test
    public void payment_is_incorrect(){
        Mockito.when(gateway.requestPayment(Mockito.any()))
                .thenReturn(new PaymentResponse(PaymentResponse.paymentStatus.ERROR));

        assertFalse(paymentProcessor.makePayment(1000));
    }

}