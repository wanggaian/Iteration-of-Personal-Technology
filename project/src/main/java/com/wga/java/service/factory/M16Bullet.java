package com.wga.java.service.factory;

/**
 * M16Bullet
 *
 * @Author wanggaian <v_wanggaian@baidu.com>
 * @Date 2019/3/8 16:38
 */
public class M16Bullet implements Bullet {
    @Override
    public void load() {
        System.out.println("load M16 Bullet");
    }
}
