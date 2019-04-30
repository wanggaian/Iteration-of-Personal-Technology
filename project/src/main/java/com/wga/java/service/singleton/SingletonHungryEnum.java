package com.wga.java.service.singleton;

import java.io.Serializable;

/**
 * SingletonHungryEnum
 *
 * @Author wanggaian <v_wanggaian@baidu.com>
 * @Date 2019/3/6 15:52
 */
public enum SingletonHungryEnum implements Serializable {

    // 枚举的单个元素就是一个实例
    INSTANCE;

    public void doSomething() {
        System.out.println("SingletonHungryEnum");
    }
}
