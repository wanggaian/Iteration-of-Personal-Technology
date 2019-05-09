package com.wga.java.service.singleton;


import org.springframework.stereotype.Service;

/**
 * SingletonService
 *
 * @Author wanggaian <v_wanggaian@baidu.com>
 * @Date 2019/3/6 11:41
 */
@Service
public class SingletonService {

    public void fun() {
        System.out.println(SingletonHungry.getInstance().hashCode());
    }
}
