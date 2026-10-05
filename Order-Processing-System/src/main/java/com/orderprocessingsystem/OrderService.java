package com.orderprocessingsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrderService
{
    PaymentService ps;

    @Autowired
    public OrderService(PaymentService ps)
    {
        this.ps=ps;
    }

    public void placeOrder()
    {
        ps.pay();
        System.out.println("Order placed!!!");
    }


}
