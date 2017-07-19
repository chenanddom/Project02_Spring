package com.ccpg2.aspect;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * Created by lenovo on 2017/7/18.
 */
public class MyAspect implements MethodInterceptor{
    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        System.out.println("方法执行之前...");
        Object object = methodInvocation.proceed();
        System.out.println("方法执行之后...");
        return object;
    }
}
