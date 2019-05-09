package com.wga.java.service.thread;

/**
 * Run2
 *
 * @Author wanggaian <v_wanggaian@baidu.com>
 * @Date 2019/3/1 11:44
 */
public class Run2 {

    public static void main(String[] args) {
        Thread thread = new MyThread2();
        thread.start();
        try {
            Thread.sleep(2000);
            thread.interrupt();

            System.out.println("stop1 ->" + Thread.interrupted());
            System.out.println("stop2 ->" + Thread.interrupted());

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
