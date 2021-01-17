package com.px.config;

import com.px.filter.MyServletFilter;
import com.px.intercepter.LoginInterceptor;
import com.px.listener.MyServletListener;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.servlet.Filter;
import javax.servlet.ServletRequestListener;

@Configuration
public class WebMcvConfigurer implements WebMvcConfigurer {

    public void addInterceptors(InterceptorRegistry registry) {
//        registry.addInterceptor(getHandlerInterceptor()).addPathPatterns("/**");
    }

    @Bean
    public ServletRequestListener getServletListener() {
        return new MyServletListener();
    }

    @Bean
    public Filter getFilter() {
        return new MyServletFilter();
    }

    @Bean
    public HandlerInterceptor getHandlerInterceptor() {
        return new LoginInterceptor();
    }
}
