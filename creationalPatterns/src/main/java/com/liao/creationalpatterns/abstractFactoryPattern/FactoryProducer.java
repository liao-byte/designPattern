package com.liao.creationalpatterns.abstractFactoryPattern;

/**
 * @author liaozhangsheng
 * @Date 2022/12/14
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(String choice){
        if("SHAPE".equalsIgnoreCase(choice)){
            return new ShapeFactory();
        } else if("COLOR".equalsIgnoreCase(choice)){
            return new ColorFactory();
        }
        return null;
    }
}
