package com.ccpg2.serviceimpl;

import com.ccpg2.bean.User;
import com.ccpg2.service.UserService;

/**
 * Created by lenovo on 2017/7/18.
 */
public class UserServiceImpl implements UserService {
    @Override
    public void registerUser(com.ccpg2.bean.User user) {
        System.out.println("regist success");
    }
    @Override
    public void updateUser(com.ccpg2.bean.User user) {
        System.out.println("update success");
    }
}
