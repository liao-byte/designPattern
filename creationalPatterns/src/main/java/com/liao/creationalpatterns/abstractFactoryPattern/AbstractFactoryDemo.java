package com.liao.creationalpatterns.abstractFactoryPattern;

/**
 * @author liaozhangsheng
 * @Date 2022/12/14
 */
public class AbstractFactoryDemo {
    public static void main(String[] args) {
        AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");

        Shape circle = shapeFactory.getShape("circle");
        circle.draw();
        Shape square = shapeFactory.getShape("square");
        square.draw();
        Shape rectangle = shapeFactory.getShape("rectangle");
        rectangle.draw();

        AbstractFactory colorFactory = FactoryProducer.getFactory("Color");
        Color red = colorFactory.getColor("red");
        red.fill();
        Color green = colorFactory.getColor("green");
        green.fill();
        Color blue = colorFactory.getColor("blue");
        blue.fill();

    }
}
