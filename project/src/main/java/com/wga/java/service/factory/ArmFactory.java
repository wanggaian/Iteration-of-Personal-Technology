package com.wga.java.service.factory;

/**
 * ArmFactory
 *
 * @Author wanggaian <v_wanggaian@baidu.com>
 * @Date 2019/3/8 16:39
 */
public interface ArmFactory {

    public Gun produceGun();

    public Bullet produceBullet();
}
