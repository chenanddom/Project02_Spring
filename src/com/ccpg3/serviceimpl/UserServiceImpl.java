package com.ccpg3.serviceimpl;

import com.ccpg3.bean.User;
import com.ccpg3.service.UserService;

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
        System.out.println("update success");
    }
}
