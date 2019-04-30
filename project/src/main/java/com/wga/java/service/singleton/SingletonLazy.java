package com.wga.java.service.singleton;

/**
 * SingletonLazy
 *
 * @Author wanggaian <v_wanggaian@baidu.com>
 * @Date 2019/3/6 11:53
 */
public class SingletonLazy {

    private static SingletonLazy uniqueInstance;

    private SingletonLazy() {

    }

    // 没有加synchronized是线程不安全的
    public static SingletonLazy getInstance() {
        // 如果没有则创建再返回
        if (uniqueInstance == null) {
            uniqueInstance = new SingletonLazy();
        }
        return uniqueInstance;
    }
}
