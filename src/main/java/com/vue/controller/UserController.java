package com.vue.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.vue.entity.vueUser;
import com.vue.mapper.userMapper;
import com.vue.service.Impl.userServiceImpl;
import com.vue.service.userService;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class UserController {

    @Resource
    userService userService;

    @CrossOrigin
    @RequestMapping(value = "/user/register/{name}/{password}",method = RequestMethod.GET)
    public String register(@PathVariable String name,
                            @PathVariable String password){
        try {
            userService.userRegister(name, password);
        } catch (Exception e) {
            return "注册失败";
        }
        return "注册成功";
    }
    @CrossOrigin
    @RequestMapping(value = "/user/selectOne/{name}",method = RequestMethod.GET)
    public boolean selectOne(@PathVariable String name){
        vueUser v = userService.userSelectOne(name);
        return v != null;
    }
    @CrossOrigin
    @RequestMapping(value = "/user/login/{name}/{password}",method = RequestMethod.GET)
    public String login(@PathVariable String name,
                         @PathVariable String password){
        vueUser v = userService.userLogin(name);
        if (v.getUsername().equals(name)){
            if (v.getPassword().equals(password)){
                return "登录成功";
            }else {
                return "密码错误";
            }
        }else {
            return "用户名错误";
        }
    }

}
