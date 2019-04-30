package com.wga.java.service.factory;

/**
 * Rectangle
 *
 * @Author wanggaian <v_wanggaian@baidu.com>
 * @Date 2019/3/7 11:30
 */
public class Rectangle implements Shape {

    public Rectangle() {
        System.out.println("Rectangle");
    }

    @Override
    public void draw() {
        System.out.println("draw rectangle");
    }
}
