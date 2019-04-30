package com.wga.service.factory;

import com.wga.java.service.factory.AK47Factory;
import com.wga.java.service.factory.ArmFactory;
import com.wga.java.service.factory.Bullet;
import com.wga.java.service.factory.Gun;
import org.junit.Test;

/**
 * ArmFactoryTest
 *
 * @Author wanggaian <v_wanggaian@baidu.com>
 * @Date 2019/3/8 16:48
 */
public class ArmFactoryTest {

    @Test
    public void armFactoryTest() {
        ArmFactory armFactory;
        Gun gun;
        Bullet bullet;
        armFactory = new AK47Factory();
        bullet = armFactory.produceBullet();
        gun = armFactory.produceGun();
        bullet.load();
        gun.shooting();
    }
}
