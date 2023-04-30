package com.sxx.dto;

import lombok.Data;

/**
 * @author SHIXINXI
 * @description
 * @create 2023-04-10-10:42
 */

@Data
public class LogInDTO {

    private Integer accountId;

    private String name;

    private String password;
}
