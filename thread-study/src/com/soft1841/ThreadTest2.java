package com.soft1841;

public class ThreadTest2 extends Object implements Runnable {
    private int count = 10;

    @Override
    public void run() {
        while (true) {
            //打印count变量
            System.out.print(count + " ");
            //使count变量自减，当自减为0时，退出循环
            if (--count == 0) {
                break;
            }
        }
    }
    public static void main(String[] args) {
        //创建线程对象
        ThreadTest test = new ThreadTest();
        //启动线程
        test.start();
    }
}
