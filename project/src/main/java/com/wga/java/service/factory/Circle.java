package com.wga.java.service.factory;

/**
 * Circle
 *
 * @Author wanggaian <v_wanggaian@baidu.com>
 * @Date 2019/3/7 11:26
 */
public class Circle implements Shape {

    public Circle() {
        System.out.println("Circle");
    }

    @Override
    public void draw() {
        System.out.println("draw circle");
    }
}
