package com.ccpg1.factory;

import com.ccpg1.aspect.MyAspect;
import com.ccpg1.service.UserService;
import com.ccpg1.serviceimpl.UserServiceImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by lenovo on 2017/7/18.
 */
public class MyBeanFactory {
    public static UserService createService(){
        final MyAspect as = new MyAspect();
        final UserService service = new UserServiceImpl();
        return (UserService) Proxy.newProxyInstance(MyBeanFactory.class.getClassLoader(), service.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
           as.before();
           Object object = method.invoke(service,args);
            as.after();
                return object;
            }
        });
    }


}
