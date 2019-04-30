package com.wga.java.service.factory;

/**
 * ShapeFactory
 *
 * @Author wanggaian <v_wanggaian@baidu.com>
 * @Date 2019/3/8 11:28
 */
public class ShapeFactory {

    // 通过getShape获取形状类型对象
    public static Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        if (shapeType.equalsIgnoreCase("circle")) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("rectangle")) {
            return new Rectangle();
        } else if (shapeType.equalsIgnoreCase("square")) {
            return new Square();
        }
        return null;
    }
}
