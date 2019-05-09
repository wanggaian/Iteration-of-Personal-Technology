package com.wga.java.service.thread;

/**
 * MyThread
 *
 * @Author wanggaian <v_wanggaian@baidu.com>
 * @Date 2019/2/28 11:33
 */
public class MyThread extends Thread {

    public void run() {
        super.run();
        for (int i = 0; i < 500000; i++) {
            System.out.println("i =" +(i + 1));
        }
    }
}
