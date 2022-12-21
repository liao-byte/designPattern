package com.liao.creationalpatterns.abstractFactoryPattern;

import com.liao.creationalpatterns.abstractFactoryPattern.impl.Circle;
import com.liao.creationalpatterns.abstractFactoryPattern.impl.Rectangle;
import com.liao.creationalpatterns.abstractFactoryPattern.impl.Square;
import org.apache.commons.lang3.StringUtils;

/**
 * @author liaozhangsheng
 * @Date 2022/12/14
 */
public class ShapeFactory  implements AbstractFactory{
    @Override
    public Shape getShape(String shape){
        if (StringUtils.isEmpty(shape)){
            return null;
        }
        if ("CIRCLE".equalsIgnoreCase(shape)){
            return new Circle();
        }else if ("RECTANGLE".equalsIgnoreCase(shape)){
            return new Rectangle();
        }else if ("SQUARE".equalsIgnoreCase(shape)){
            return new Square();
        }
        return null;
    }

    @Override
    public Color getColor(String color) {
        return null;
    }

}
