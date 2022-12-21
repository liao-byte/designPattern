package com.liao.creationalpatterns.abstractFactoryPattern.impl;

import com.liao.creationalpatterns.abstractFactoryPattern.Color;

/**
 * @author liaozhangsheng
 * @Date 2022/12/14
 */
public class Blue implements Color {
    @Override
    public void fill() {
        System.out.println("红色");
    }
}
