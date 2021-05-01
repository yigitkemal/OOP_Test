package com.yigitkemal.interfaces;

public class CustomerManager {

    private Logger[] loggers;

    public CustomerManager(Logger[] loggers) {
        this.loggers = loggers;
    }

    public void add(Customer customer){
        System.out.println("müşteri eklendi "+customer.getFirstName());
        
    }

    public void delete(Customer customer){
        System.out.println("Müşteri silindi "+customer.getFirstName());

    }



}
