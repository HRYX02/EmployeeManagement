package com.sxx.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;
import lombok.Getter;

/**
 * @author SHIXINXI
 * @create 2023-03-06-14:12
 */
@Getter
public enum SexEnum {
    FEMAIL(0,"女"),
    MAIL(1,"男");

    @EnumValue
    private Integer sex;
    private String sexName;

    SexEnum(Integer sex,String sexName) {
        this.sex = sex;
        this.sexName = sexName;
    }
}
