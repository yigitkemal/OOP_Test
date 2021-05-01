package com.yigitkemal.interfaces;

public class FileLogger implements Logger{
    @Override
    public void log(String message) {
        System.out.println("FileLogger loglandi");
    }
}
