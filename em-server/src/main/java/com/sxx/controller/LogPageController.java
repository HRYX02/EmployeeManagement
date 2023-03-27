package com.sxx.controller;

import com.sxx.controller.utils.Protocol;
import com.sxx.pojo.LogIn;
import com.sxx.service.ILogInSerivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author SHIXINXI
 * @create 2023-03-08-19:12
 */

@CrossOrigin("http://localhost:8080")
@RestController
@RequestMapping("/em")
public class LogPageController {

    @Autowired
    private ILogInSerivce logInSerivce;


    @PostMapping("/login")
    private Protocol login(@RequestBody LogIn logIn){
        return new Protocol(true,logInSerivce.logInCheck(logIn));
    }
}
