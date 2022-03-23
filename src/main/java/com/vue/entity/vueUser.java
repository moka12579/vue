package com.vue.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.segments.MergeSegments;
import com.vue.mapper.userMapper;
import lombok.Data;

@Data
@TableName("vue_user")
public class vueUser {
    @TableId(type = IdType.AUTO)
    private  Integer id;
    @TableField
    private  String username;
    @TableField
    private  String password;

}
