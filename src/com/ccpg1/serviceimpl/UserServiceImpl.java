package com.ccpg1.serviceimpl;

import com.ccpg1.aspect.MyAspect;
import com.ccpg1.bean.User;
import com.ccpg1.service.UserService;

/**
 * Created by lenovo on 2017/7/18.
 */
public class UserServiceImpl implements UserService {

    @Override
    public void registerUser(User user) {
    System.out.println("regist success");
    }

    @Override
    public void updateUser(User user) {

    }
}
