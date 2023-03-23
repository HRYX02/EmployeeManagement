package com.sxx.controller.utils;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Properties;

/**
 * @author SHIXINXI
 * @create 2023-02-24-16:39
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Protocol {
    private Boolean flag;
    private Object data;

    public Protocol(Boolean flag){
        this.flag = flag;
    }
}
