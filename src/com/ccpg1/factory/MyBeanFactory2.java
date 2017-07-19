package com.ccpg1.factory;

import com.ccpg1.aspect.MyAspect;
import com.ccpg1.service.UserService;
import com.ccpg1.serviceimpl.UserServiceImpl;
import org.springframework.cglib.proxy.Callback;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Created by lenovo on 2017/7/18.
 */
public class MyBeanFactory2 {
    public static UserService createService() {
        //1 目标类
        final UserServiceImpl userService = new UserServiceImpl();
        //2切面类
        final MyAspect as = new MyAspect();
        // 3.代理类 ，采用cglib，底层创建目标类的子类
        //3.1 核心类
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(UserService.class);
        enhancer.setCallback(new MethodInterceptor() {
            @Override
            public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                as.before();
                Object obj = method.invoke(userService, objects);
                as.after();
                return obj;
            }
        });
        UserServiceImpl us = (UserServiceImpl) enhancer.create();
        return us;
    }
}
