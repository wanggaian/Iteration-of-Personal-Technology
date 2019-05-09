package com.wga.java.service.factory;

/**
 * M16Factory
 *
 * @Author wanggaian <v_wanggaian@baidu.com>
 * @Date 2019/3/8 16:47
 */
public class M16Factory implements ArmFactory {
    @Override
    public Gun produceGun() {
        return new M16Gun();
    }

    @Override
    public Bullet produceBullet() {
        return new M16Bullet();
    }
}
