package com.springcore1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrderService
{
    PaymentService payment;

    @Autowired
    public OrderService(PaymentService payment)
    {
        this.payment = payment;
    }

    public void placeOrder()
    {
        payment.pay();
        System.out.println("order placed");
    }
}
