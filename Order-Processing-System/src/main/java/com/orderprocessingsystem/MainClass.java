package com.orderprocessingsystem;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass
{
    public static void main(String[] args)
    {
        ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);

        OrderService o1=context.getBean(OrderService.class);
        o1.placeOrder();
    }
}
