package com.ccpg1.aspect;

/**
 * Created by lenovo on 2017/7/18.
 */
public class MyAspect {
    public void before(){
        System.out.println("方法执行之前...");
    }
    public void after(){
        System.out.println("方法执行之后...");
    }
}
