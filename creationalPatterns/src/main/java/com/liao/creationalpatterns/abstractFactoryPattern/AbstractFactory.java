package com.liao.creationalpatterns.abstractFactoryPattern;

/**
 * @author liaozhangsheng
 * @Date 2022/12/14
 */
public interface  AbstractFactory {
    public  Color getColor(String color);
    public Shape getShape(String shape);
}
