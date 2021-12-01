package com.vue.service.Impl;

import com.vue.entity.vueUser;
import com.vue.mapper.userMapper;
import com.vue.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userServiceImpl")
public class userServiceImpl implements userService {
    @Autowired
    private userMapper userMapper;
    private vueUser users;
    @Override
    public void userRegedit(String username, String password) {

    }

    @Override
    public void userLogin(String username, String password) {

    }
}
