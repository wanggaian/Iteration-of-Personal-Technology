package com.wga.java.service.factory;

/**
 * CircleFactory
 *
 * @Author wanggaian <v_wanggaian@baidu.com>
 * @Date 2019/3/8 15:33
 */
public class CircleFactory implements Factory {
    @Override
    public Shape getShape() {
        return new Circle();
    }
}
