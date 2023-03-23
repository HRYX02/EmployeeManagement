package com.sxx.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * 登陆检查
 * 1 配置好拦截器要拦截哪些请求
 * 2 把这些配置放在容器中
 * @author SHIXINXI
 * @create 2023-03-09-19:31
 */
public class LoginInterceptor implements HandlerInterceptor {
//    @Override
//    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
//        HttpSession session = request.getSession();
//        Object login = session.getAttribute("login");
//        if(login != null){
//            return true;
//        }else {
//            response.sendRedirect("/");
//            return false;
//        }
//    }
}
