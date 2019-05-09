package com.wga.java.service.thread;

/**
 * Run4
 *
 * @Author wanggaian <v_wanggaian@baidu.com>
 * @Date 2019/3/1 14:35
 */
public class Run4 {

    public static void main(String args[]) {
        Thread thread = new MyThread2();
        thread.start();
        thread.interrupt();
        System.out.println("stop1 ->" + thread.isInterrupted());
        System.out.println("stop2 ->" + thread.isInterrupted());
    }
}
