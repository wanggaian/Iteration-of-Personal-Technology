package com.wga.java.service.factory;

/**
 * ShapeFactory2
 *
 * @Author wanggaian <v_wanggaian@baidu.com>
 * @Date 2019/3/8 14:53
 */
public class ShapeFactory2 {

    public static Object getShape(Class<? extends Shape> clazz) {
        Object obj = null;
        try {
            obj = Class.forName(clazz.getName()).newInstance();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return obj;
    }
}
