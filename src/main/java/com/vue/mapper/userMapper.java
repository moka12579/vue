package com.vue.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.vue.entity.vueUser;
import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;

@Mapper
public interface userMapper extends BaseMapper<vueUser> {



}
