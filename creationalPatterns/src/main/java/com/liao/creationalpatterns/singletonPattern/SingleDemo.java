package com.liao.creationalpatterns.singletonPattern;

/**
 * @author liaozhangsheng
 * @Date 2022/12/14
 */
public class SingleDemo {
    public static void main(String[] args) {
        SingleObject instance = SingleObject.getInstance();
        instance.showMessage();


        SingleObject1 instance1 = SingleObject1.getInstance();
        instance1.showMessage();
    }
}
