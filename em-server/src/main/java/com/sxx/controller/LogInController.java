package com.sxx.controller;

import com.sxx.controller.utils.Protocol;
import com.sxx.dto.LogInDTO;
import com.sxx.service.ILogInService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author SHIXINXI
 * @create 2023-03-08-19:12
 */

@CrossOrigin("http://localhost:8080")
@RestController
@RequestMapping("/em")
public class LogInController {
    @Autowired
    private ILogInService logInService;

    @PostMapping("/login")
    private Protocol login(@RequestBody LogInDTO logInDTO){
        return new Protocol(true,logInService.logInCheck(logInDTO));
    }
}
