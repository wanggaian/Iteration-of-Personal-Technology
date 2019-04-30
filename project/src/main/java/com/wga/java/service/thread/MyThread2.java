package com.wga.java.service.thread;

/**
 * MyThread2
 *
 * @Author wanggaian <v_wanggaian@baidu.com>
 * @Date 2019/3/1 11:41
 */
public class MyThread2 extends Thread {

    public void run() {
        super.run();
        for (int i = 0; i < 500000; i++) {
            // System.out.println(i);
        }
    }
}
