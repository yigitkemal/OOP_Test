package com.company;

public class Main {

    public static void main(String[] args) {

        IndividualCustomer yigit = new IndividualCustomer();
        yigit.customerNumber = "3333";

        CorporateCustomer hepsiBurada = new CorporateCustomer();
        hepsiBurada.customerNumber ="5555";

        SendikaCustomer sendikaCustomer = new SendikaCustomer();
        sendikaCustomer.customerNumber="66666";

        CustomerManager customerManager = new CustomerManager();

        Customer[] customers = {yigit,hepsiBurada,sendikaCustomer};
        customerManager.addMultiple(customers);

        for (Customer customer: customers) {
            System.out.println(customer.customerNumber);
        }

    }
}
