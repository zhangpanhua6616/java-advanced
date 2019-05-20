package com.soft1841.factorypattern;

/**
 * 工厂模式测试类
 */
public class FactoryTest {
    public static void main(String[] args) {
        Shape circle = ShapeFactory.getCircleInstance();
        circle.draw();
        Shape rectangle = ShapeFactory.getRectangleInstance();
        rectangle.draw();
    }
}
