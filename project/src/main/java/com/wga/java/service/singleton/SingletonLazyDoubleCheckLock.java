package com.wga.java.service.singleton;

import java.io.Serializable;

/**
 * SingletonLazyDoubleCheckLock
 *
 * @Author wanggaian <v_wanggaian@baidu.com>
 * @Date 2019/3/6 14:26
 */
public class SingletonLazyDoubleCheckLock implements Serializable {

    // volatile 保证当uniqueInstance实例化之后,多个线程可以正确处理
    private volatile static SingletonLazyDoubleCheckLock uniqueInstance;

    private SingletonLazyDoubleCheckLock() {
    }

    public static SingletonLazyDoubleCheckLock getInstance() {
        // 首次进入方法的执行静态代码块
        if (uniqueInstance == null) {
            synchronized(SingletonLazyDoubleCheckLock.class) {
                // 进入代码块再判断,还是为null则创建实例
                if (uniqueInstance == null) {
                    uniqueInstance = new SingletonLazyDoubleCheckLock();
                }
            }
        }
        return uniqueInstance;
    }
}