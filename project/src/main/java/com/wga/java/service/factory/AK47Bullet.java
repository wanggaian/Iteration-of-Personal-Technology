package com.wga.java.service.factory;

/**
 * AK47Bullet
 *
 * @Author wanggaian <v_wanggaian@baidu.com>
 * @Date 2019/3/8 16:37
 */
public class AK47Bullet implements Bullet {
    @Override
    public void load() {
        System.out.println("load AK47 Bullet");
    }
}
