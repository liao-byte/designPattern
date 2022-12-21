package com.liao.creationalpatterns.abstractFactoryPattern.impl;

import com.liao.creationalpatterns.abstractFactoryPattern.Shape;

/**
 * @author liaozhangsheng
 * @Date 2022/12/14
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("使用圆形");
    }
}
