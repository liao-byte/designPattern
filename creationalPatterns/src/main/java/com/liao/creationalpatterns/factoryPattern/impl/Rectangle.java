package com.liao.creationalpatterns.factoryPattern.impl;

import com.liao.creationalpatterns.factoryPattern.Shape;

/**
 * @author liaozhangsheng
 * @Date 2022/12/14
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("使用长方形");
    }
}
