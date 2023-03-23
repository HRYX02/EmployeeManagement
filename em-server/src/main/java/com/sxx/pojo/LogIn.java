package com.sxx.pojo;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author SHIXINXI
 * @create 2023-03-08-18:57
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("login")
public class LogIn {
    @TableId
    private Integer id;
    private Integer accountId;
    private String name;
    private String password;
    @TableLogic
    private Integer isDelete;
}
