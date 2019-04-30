package com.wga.java.service.singleton;

/**
 * SingletonHungry
 * 饿汉模式(线程安全)
 *
 * @Author wanggaian <v_wanggaian@baidu.com>
 * @Date 2019/3/6 11:28
 */
public class SingletonHungry {

    // 静态化初始器创建实例对象 保证线程安全
    private static SingletonHungry uniqueInstance = new SingletonHungry();

    private SingletonHungry() {
        // Singleton类只有一个构造方法 且private修饰, 外部不可以new出其它对象
    }

    public static SingletonHungry getInstance() {
        return uniqueInstance;
    }
}
