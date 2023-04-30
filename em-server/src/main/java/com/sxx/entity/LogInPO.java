package com.sxx.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author SHIXINXI
 * @description LogIn登录数据---已完成
 * @create 2023-04-10-10:04
 */
@TableName("login")
@Data
public class LogInPO {
    @TableId
    private Integer id;
    private Integer accountId;
    private String name;
    private String password;
    @TableLogic
    private Integer isDelete;
}
