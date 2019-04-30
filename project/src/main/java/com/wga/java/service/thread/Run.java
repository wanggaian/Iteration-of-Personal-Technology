package com.wga.java.service.thread;

/**
 * Run
 *
 * @Author wanggaian <v_wanggaian@baidu.com>
 * @Date 2019/2/28 11:36
 */
public class Run {

    public static void main(String[] args) {
        Thread thread = new MyThread();
        thread.start();
        try {
            Thread.sleep(2000);
            thread.interrupt();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
