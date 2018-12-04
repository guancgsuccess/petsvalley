package com.petsvalley.interceptor;

import com.petsvalley.entity.Customer;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@Component
public class LoginInterceptor implements HandlerInterceptor{
    @Override
    public boolean preHandle( HttpServletRequest request, HttpServletResponse response, Object handler ) throws Exception {
        System.out.println("进入拦截器" );
        Customer customer=(Customer ) request.getSession().getAttribute( "customer" );
        if(customer!=null){
            System.out.println("用户已经登录" );
            return true;
        }
        System.out.println("用户未登录,请登录" );
        response.sendRedirect("/not_logged");
        return false;
    }

    @Override
    public void postHandle( HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView ) throws Exception {
        System.out.println("请求处理之后,视图响应之前,拦截工作" );
    }

    @Override
    public void afterCompletion( HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex ) throws Exception {
        System.out.println("请求处理之后,拦截工作" );
    }
}
