package com.wga.java.service.thread;

/**
 * MyThread5
 *
 * @Author wanggaian <v_wanggaian@baidu.com>
 * @Date 2019/3/1 15:46
 */
public class MyThread5 extends Thread {

    public void run() {
        super.run();
        for (int i = 0; i < 500000; i++) {
            if (this.isInterrupted()) {
                System.out.println("线程中止,不在执行for循环");
            }
            System.out.println("i=" + (i+1));
        }
    }
}