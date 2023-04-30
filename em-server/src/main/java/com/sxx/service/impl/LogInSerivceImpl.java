package com.sxx.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sxx.dao.LogInDao;
import com.sxx.dto.LogInDTO;
import com.sxx.entity.LogInPO;
import com.sxx.service.ILogInService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

/**
 * @description 登录页的实现类
 * @author SHIXINXI
 * @create 2023-03-08-19:05
 */

@Service
public class LogInSerivceImpl extends ServiceImpl<LogInDao, LogInPO> implements ILogInService {

    /**
     * 员工账号登陆检查
     */
    @Override
    public LogInDTO logInCheck(LogInDTO logInDTO){
        LambdaQueryWrapper<LogInPO> lambdaQueryWrapper = new LambdaQueryWrapper<>();
        lambdaQueryWrapper.select(LogInPO::getName, LogInPO::getAccountId, LogInPO::getPassword);
        lambdaQueryWrapper.eq(logInDTO.getAccountId() != null, LogInPO::getAccountId, logInDTO.getAccountId()).eq(logInDTO.getPassword() != null, LogInPO::getPassword, logInDTO.getPassword());
        LogInPO logInPO = this.getOne(lambdaQueryWrapper);
        BeanUtils.copyProperties(logInPO,logInDTO);
        return logInDTO;
    }
}
