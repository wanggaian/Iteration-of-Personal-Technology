package com.wga.service.factory;

import com.wga.java.service.factory.Circle;
import com.wga.java.service.factory.CircleFactory;
import com.wga.java.service.factory.Factory;
import com.wga.java.service.factory.Rectangle;
import com.wga.java.service.factory.Shape;
import com.wga.java.service.factory.ShapeFactory;
import com.wga.java.service.factory.ShapeFactory2;
import com.wga.java.service.factory.Square;
import org.junit.Test;

/**
 * ShapeFactoryTest
 *
 * @Author wanggaian <v_wanggaian@baidu.com>
 * @Date 2019/3/8 11:39
 */
public class ShapeFactoryTest {

    @Test
    public void getShapeTest() {
        Shape circle = ShapeFactory.getShape("CIRCLE");
        circle.draw();
        Shape rectangle = ShapeFactory.getShape("RecTangle");
        rectangle.draw();
        Shape square = ShapeFactory.getShape("square");
        square.draw();
    }

//    @Test
//    public void getShapeTest2() {
//        Circle circle = (Circle) ShapeFactory2.getShape(Circle.class);
//        circle.draw();
//        Rectangle rectangle = (Rectangle) ShapeFactory2.getShape(Rectangle.class);
//        rectangle.draw();
//        Square square = (Square) ShapeFactory2.getShape(Square.class);
//        square.draw();
//    }

    @Test
    public void getShapeTest2() {
        Shape circle = (Circle) ShapeFactory2.getShape(Circle.class);
        circle.draw();
        Rectangle rectangle = (Rectangle) ShapeFactory2.getShape(Rectangle.class);
        rectangle.draw();
        Square square = (Square) ShapeFactory2.getShape(Square.class);
        square.draw();
    }

    @Test
    public void getShapeTest3() {
        Factory circleFactory = new CircleFactory();
        Shape circle = circleFactory.getShape();
        circle.draw();
    }
}
