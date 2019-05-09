package com.wga.java.service.singleton;

/**
 * SingletonLazyHolder
 *
 * @Author wanggaian <v_wanggaian@baidu.com>
 * @Date 2019/3/6 15:38
 */
public class SingletonLazyHolder {

    private static class SingletonHolder {
        private static final SingletonLazyHolder INSTANCE = new SingletonLazyHolder();
    }

    private SingletonLazyHolder() {
    }

    public static final SingletonLazyHolder getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
