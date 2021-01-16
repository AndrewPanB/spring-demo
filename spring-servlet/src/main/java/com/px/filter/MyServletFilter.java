package com.px.filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.*;
import java.io.IOException;

public class MyServletFilter implements Filter {
    private Logger logger = LoggerFactory.getLogger(MyServletFilter.class);
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        logger.info("Filter init!");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        logger.info("Filter doFilter start!");
        filterChain.doFilter(servletRequest, servletResponse);
        logger.info("Filter doFilter end!");
    }

    @Override
    public void destroy() {
        logger.info("Filter destroy!");
    }
}
