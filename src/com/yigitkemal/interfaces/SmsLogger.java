package com.yigitkemal.interfaces;

public class SmsLogger implements Logger{

    @Override
    public void log(String message) {
        System.out.println("Sms Logger içerisindeki log implements ile çalıştı "+message);
    }

}
