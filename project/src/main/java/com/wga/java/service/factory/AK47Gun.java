package com.wga.java.service.factory;

/**
 * AK47Gun
 *
 * @Author wanggaian <v_wanggaian@baidu.com>
 * @Date 2019/3/8 16:27
 */
public class AK47Gun implements Gun{
    @Override
    public void shooting() {
        System.out.println("shooting with AK47");
    }
}
