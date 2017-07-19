package com.ccpg4.basexml;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by lenovo on 2017/7/19.
 */
public class TestAop {
    @Test
    public void test1(){
        String xmlPath = "com/ccpg4/basexml/bean.xml";
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
       UserService service = (UserService) applicationContext.getBean("userServiceId");
       service.registerUser();
    }
    @Test
    public void test2(){
        String xmlPath = "com/ccpg4/basexml/bean.xml";
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
        UserService service = (UserService) applicationContext.getBean("userServiceId");
        boolean ret = service.modifyUser();
         System.out.println("ret="+ret);
    }
    @Test
    public void test3(){
        String xmlPath = "com/ccpg4/basexml/bean.xml";
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
        UserService service = (UserService) applicationContext.getBean("userServiceId");
        boolean ret = service.modifyUser();
    }
    @Test
    public void test4(){
        String xmlPath = "com/ccpg4/basexml/bean.xml";
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
        UserService service = (UserService) applicationContext.getBean("userServiceId");
        boolean ret = service.modifyUser();
    }

    @Test
    public void test5(){
        String xmlPath = "com/ccpg4/basexml/bean.xml";
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
        UserService service = (UserService) applicationContext.getBean("userServiceId");
        service.registerUser();
    }
    @Test
    public void test6(){
        String xmlPath = "com/ccpg4/basexml/bean.xml";
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
        UserService service = (UserService) applicationContext.getBean("userServiceId");
        service.registerUser();
    }
}
