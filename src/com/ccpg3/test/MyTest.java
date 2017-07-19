package com.ccpg3.test;

import com.ccpg3.service.UserService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by lenovo on 2017/7/18.
 */
public class MyTest {
    @Test
    public void test1(){
        String xmlPath="com/ccpg3/bean/bean.xml";
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
        UserService service = (UserService)applicationContext.getBean("userServiceId");
        com.ccpg3.bean.User user = new com.ccpg3.bean.User();
        user.setuName("张三");
        user.setuId(1001);
        user.setuAge(20);

        service.registerUser(user);
    }
}
