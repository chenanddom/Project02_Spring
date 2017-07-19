package com.ccpg2.test;

import com.ccpg2.bean.User;
import com.ccpg2.service.UserService;
import com.ccpg2.serviceimpl.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by lenovo on 2017/7/18.
 */
public class MyTest {
    @Test
    public void test1(){
    String xmlPath = "com/ccpg2/bean/bean.xml";
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
        UserService userService = (UserService) applicationContext.getBean("proxyId");
        User user = new User();
        user.setuName("张三");
        user.setuId(1001);
        user.setuAge(20);
        userService.registerUser(user);
    }

}
