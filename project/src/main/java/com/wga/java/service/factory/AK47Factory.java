package com.wga.java.service.factory;

/**
 * AK47Factory
 *
 * @Author wanggaian <v_wanggaian@baidu.com>
 * @Date 2019/3/8 16:45
 */
public class AK47Factory implements ArmFactory {
    @Override
    public Gun produceGun() {
        return new AK47Gun();
    }

    @Override
    public Bullet produceBullet() {
        return new AK47Bullet();
    }
}
