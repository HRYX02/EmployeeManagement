package com.sxx.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.sxx.dto.LogInDTO;
import com.sxx.entity.LogInPO;

/**
 * @author SHIXINXI
 * @create 2023-03-08-19:04
 */
public interface ILogInService extends IService<LogInPO> {
    /**
     * @description 登录接口
     * @param logInDTO 登录对象
     * @return Login
     */
    LogInDTO logInCheck(LogInDTO logInDTO);
}
