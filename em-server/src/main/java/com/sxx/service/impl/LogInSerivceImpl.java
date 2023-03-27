package com.sxx.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sxx.dao.LogInDao;
import com.sxx.pojo.LogIn;
import com.sxx.service.ILogInSerivce;
import org.springframework.stereotype.Service;

/**
 * @author SHIXINXI
 * @create 2023-03-08-19:05
 */

@Service
public class LogInSerivceImpl extends ServiceImpl<LogInDao, LogIn> implements ILogInSerivce {
    @Override
    public LogIn logInCheck(LogIn logIn){
        LambdaQueryWrapper<LogIn> lambdaQueryWrapper = new LambdaQueryWrapper<>();
        lambdaQueryWrapper.select(LogIn::getName,LogIn::getAccountId,LogIn::getPassword);
        lambdaQueryWrapper.eq(logIn.getAccountId() != null,LogIn::getAccountId,logIn.getAccountId()).eq(logIn.getPassword() != null,LogIn::getPassword,logIn.getPassword());
        return this.getOne(lambdaQueryWrapper);
    }
}
