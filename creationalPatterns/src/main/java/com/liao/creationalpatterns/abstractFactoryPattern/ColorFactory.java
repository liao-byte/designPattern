package com.liao.creationalpatterns.abstractFactoryPattern;

import com.liao.creationalpatterns.abstractFactoryPattern.impl.*;
import org.apache.commons.lang3.StringUtils;

/**
 * @author liaozhangsheng
 * @Date 2022/12/14
 */
public class ColorFactory implements AbstractFactory{
    @Override
    public Color getColor(String color) {
        if (StringUtils.isEmpty(color)){
            return null;
        }
        if ("RED".equalsIgnoreCase(color)){
            return new Red();
        }else if ("GREEN".equalsIgnoreCase(color)){
            return new Green();
        }else if ("BLUE".equalsIgnoreCase(color)){
            return new Blue();
        }
        return null;
    }

    @Override
    public Shape getShape(String shape) {
        return null;
    }
}
