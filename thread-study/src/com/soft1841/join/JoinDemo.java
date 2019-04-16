package com.soft1841.join;

/**
 * join的用法
 * 2019.4.17
 */
public class JoinDemo extends Thread {
    @Override
    public void run() {
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("开始倒数");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        JoinDemo joinDemo = new JoinDemo();
        //新生状态
        Thread thread = new Thread(joinDemo);
        //就绪状态
        thread.start();
        //main阻塞，thread加入
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("节目开始");
    }
}