package com.yigitkemal;

import com.yigitkemal.interfaces.*;

public class Main {

    public static void main(String[] args) {

        Logger[] loggers = {new SmsLogger(), new EmailLogger()};

        CustomerManager customerManager = new CustomerManager(loggers);

        Customer yigit = new Customer(1,"Yiğit Kemal" , "Ağaç");
        customerManager.add(yigit);

    }
}
