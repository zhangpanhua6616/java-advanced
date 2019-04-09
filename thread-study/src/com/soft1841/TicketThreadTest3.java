package com.soft1841;

/**
 * 售票线程程序3
 * 实现Runnable接口并同步线程（加锁）
 */
public class TicketThreadTest3 {
    public static void main(String[] args) {
        TicketThread3 tt = new TicketThread3();
        Thread thread1 = new Thread(tt,"南工院");
        Thread thread2 = new Thread(tt,"南信院");
        Thread thread3 = new Thread(tt,"南铁院");
        thread1.start();
        thread2.start();
        thread3.start();
    }
}

class TicketThread3 implements Runnable{
    private int tickets= 10;

    @Override
    public void run() {
        while (tickets > 0){
            synchronized (this){
                if (tickets>0){
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.err.println("中断异常");
                }
                System.out.println(Thread.currentThread().getName()+" 售票，当前票数：" + --tickets);
                }else{
                    break;
                }
            }

        }
    }
}