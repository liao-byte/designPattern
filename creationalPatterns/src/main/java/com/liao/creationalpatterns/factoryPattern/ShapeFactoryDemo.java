package com.liao.creationalpatterns.factoryPattern;

/**
 * @author liaozhangsheng
 * @Date 2022/12/14
 */
public class ShapeFactoryDemo {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape circle = shapeFactory.getShape("circle");
        circle.draw();

        Shape rectangle = shapeFactory.getShape("rectangle");
        rectangle.draw();

        Shape square = shapeFactory.getShape("square");
        square.draw();
    }
}
