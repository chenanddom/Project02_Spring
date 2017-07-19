package com.ccpg4.anno;


import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * Created by lenovo on 2017/7/19.
 */
@Service("userServiceId")
public class UserServiceImpl implements UserService {
    @Override
    public void registerUser() {

//        int i= 1/0;
        System.out.println("注册成功...");
    }

    @Override
    public boolean modifyUser() {
        System.out.println("修改成功....");
        return true;
    }
}
