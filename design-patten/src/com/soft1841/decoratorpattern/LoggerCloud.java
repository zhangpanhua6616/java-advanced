package com.soft1841.decoratorpattern;

public class LoggerCloud implements Logger {
    @Override
    public void log(String message) {
        System.out.println("日志输出到云平台" + message);
    }
}
