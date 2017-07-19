package com.ccpg4.anno;

import com.ccpg4.basexml.*;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by lenovo on 2017/7/19.
 */
public class TestAopAnno {
    @Test
    public void test1() {
        String xmlPath = "com/ccpg4/anno/bean.xml";
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
        UserService userService = (UserService)applicationContext.getBean("userServiceId");
        userService.registerUser();
    }
    @Test
    public void test2(){
        String xmlPath = "com/ccpg4/anno/bean.xml";
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
        UserService userService = (UserService) applicationContext.getBean("userServiceId");
        boolean ret = userService.modifyUser();
        System.out. println("ret.."+ret);
    }
    @Test
    public void test3(){
        String xmlPath = "com/ccpg4/anno/bean.xml";
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
        UserService userService = (UserService) applicationContext.getBean("userServiceId");
        boolean ret = userService.modifyUser();
        System.out. println("ret.."+ret);
    }
    @Test
    public void test4(){
        String xmlPath = "com/ccpg4/anno/bean.xml";
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
        UserService userService = (UserService) applicationContext.getBean("userServiceId");
        userService.registerUser();
    }


}
