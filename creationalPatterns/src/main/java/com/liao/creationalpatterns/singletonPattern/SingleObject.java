package com.liao.creationalpatterns.singletonPattern;

/**
 * @author liaozhangsheng
 * @Date 2022/12/14
 */
public class SingleObject {
    private static volatile SingleObject singleObject;

    private SingleObject() {
    }
    public static SingleObject getInstance() {
        if (singleObject == null) {
            synchronized (SingleObject.class) {
                if (singleObject == null) {
                    singleObject = new SingleObject();
                }
            }
        }
        return singleObject;
    }
    public void showMessage(){
        System.out.println("SingleObject");
    }


}
