package com.sxx.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.sxx.controller.utils.Protocol;
import com.sxx.pojo.LogIn;
import com.sxx.service.ILogInSerivce;
import com.sxx.service.impl.LogInSerivceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

/**
 * @author SHIXINXI
 * @create 2023-03-08-19:12
 */

@RestController
public class LogPageController {

    @Autowired
    private ILogInSerivce logInSerivce;


    @PostMapping("/login")
    private Protocol login(@RequestBody LogIn logIn){
        LambdaQueryWrapper<LogIn> lambdaQueryWrapper = new LambdaQueryWrapper<>();
        lambdaQueryWrapper.eq(logIn.getAccountId() != null,LogIn::getAccountId,logIn.getAccountId()).eq(logIn.getPassword() != null,LogIn::getPassword,logIn.getPassword());
        LogIn log = logInSerivce.getOne(lambdaQueryWrapper);
        System.out.println(log);
        return new Protocol(true,log);
    }
}
