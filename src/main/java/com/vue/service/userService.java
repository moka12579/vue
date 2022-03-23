package com.vue.service;

import com.vue.entity.vueUser;

public interface userService {
    int userRegister(String username,String password) throws Exception;
    vueUser userLogin(String username);
    vueUser userSelectOne(String username);
}
