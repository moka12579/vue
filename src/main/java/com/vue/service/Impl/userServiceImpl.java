package com.vue.service.Impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.vue.entity.vueUser;
import com.vue.mapper.userMapper;
import com.vue.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service("userServiceImpl")
@ComponentScan({"com.vue.mapper"})
public class userServiceImpl implements userService {
    @Autowired
    private userMapper userMapper;
    private vueUser users;
    @Override
    public int userRegister(String username, String password) throws Exception{
        vueUser user = new vueUser();
        user.setUsername(username);
        user.setPassword(password);
         return userMapper.insert(user);
    }

    @Override
    public vueUser userLogin(String username) {
        QueryWrapper<vueUser> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("username",username);
        return userMapper.selectOne(queryWrapper);
    }

    @Override
    public vueUser userSelectOne(String username) {
        QueryWrapper<vueUser> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("username",username);
        return userMapper.selectOne(queryWrapper);
    }

}
