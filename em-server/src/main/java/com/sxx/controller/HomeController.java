package com.sxx.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author SHIXINXI
 * @create 2023-03-09-19:47
 */

@Controller
public class HomeController {

    @RequestMapping(value = {"/","/login"})
    private String login(){
        return "login";
    }
    @RequestMapping(value = {"/index"})
    private String index(){
        return "index";
    }
}
