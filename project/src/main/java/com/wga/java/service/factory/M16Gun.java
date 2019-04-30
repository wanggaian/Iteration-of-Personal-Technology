package com.wga.java.service.factory;

/**
 * M16Gun
 *
 * @Author wanggaian <v_wanggaian@baidu.com>
 * @Date 2019/3/8 16:35
 */
public class M16Gun implements Gun {
    @Override
    public void shooting() {
        System.out.println("shooting with M16Gun");
    }
}
