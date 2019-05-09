package com.wga.java.service.thread;

/**
 * Run3
 *
 * @Author wanggaian <v_wanggaian@baidu.com>
 * @Date 2019/3/1 14:31
 */
public class Run3 {

    public static void main(String[] args) {
        Thread.currentThread().interrupt();
        System.out.println("stop1 -> " + Thread.interrupted());
        System.out.println("stop2 -> " + Thread.interrupted());
    }
}
