package com.wga.java.service.java8;

/**
 * Formula
 *
 * @Author wanggaian <v_wanggaian@baidu.com>
 * @Date 2019/3/14 15:48
 */
public interface Formula {

    double calculate(int a);

    default double sqrt(int a) {
        return Math.sqrt(a);
    }
}
