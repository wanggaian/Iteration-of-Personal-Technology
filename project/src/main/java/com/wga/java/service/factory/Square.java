package com.wga.java.service.factory;

/**
 * Square
 *
 * @Author wanggaian <v_wanggaian@baidu.com>
 * @Date 2019/3/7 11:32
 */
public class Square implements Shape {

    public Square() {
        System.out.println("Square");
    }

    @Override
    public void draw() {
        System.out.println("draw square");
    }
}
