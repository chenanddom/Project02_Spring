package com.ccpg1.test;

import com.ccpg1.bean.User;
import com.ccpg1.factory.MyBeanFactory;
import com.ccpg1.factory.MyBeanFactory2;
import com.ccpg1.service.UserService;
import com.ccpg1.serviceimpl.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by lenovo on 2017/7/18.
 */
public class MyTest {
    @Test
    public void test(){
   /*     String xmlPath = "applicationContext.xml";
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
        applicationContext.getBean("")*/
        UserService service =  MyBeanFactory.createService();
        User user = new User();
        user.setuId(1001);
        user.setuName("张三");
        user.setuAge(22);
        service.registerUser(user);
    }
    public void test2(){
   /*     String xmlPath = "applicationContext.xml";
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
        applicationContext.getBean("")*/
        UserService service =  MyBeanFactory2.createService();
        User user = new User();
        user.setuId(1001);
        user.setuName("张三");
        user.setuAge(22);
        service.registerUser(user);
    }
}
