package com.liao.creationalpatterns.singletonPattern;

/**
 * @author liaozhangsheng
 * @Date 2022/12/14
 */
public class SingleObject1 {
    private static class SingletonHolder {
        private static final SingleObject1 INSTANCE = new SingleObject1();
    }
    private SingleObject1 (){}

    public static final SingleObject1 getInstance() {
        return SingletonHolder.INSTANCE;
    }

    public void showMessage(){
        System.out.println("SingleObject1");
    }



}
