package com.petsvalley.interceptor;

import com.petsvalley.entity.Customer;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
public class AdminInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler ) throws Exception {
        System.out.println("进入拦截器" );
        Customer customer=(Customer ) request.getSession().getAttribute( "customer" );
        if(customer!=null) {
            if (customer.getCustRole() == 1) {
                response.sendRedirect("/permission?role=1");
                System.out.println("管理员没有用户权限");
                return false;
            }
        }
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView ) throws Exception {
        System.out.println("请求处理之后,视图响应之前,拦截工作" );
    }

    @Override
    public void afterCompletion( HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex ) throws Exception {
        System.out.println("请求处理之后,拦截工作" );
    }
}
