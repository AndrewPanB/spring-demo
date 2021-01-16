package com.px.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;

public class MyServletListener implements ServletRequestListener {
    private Logger logger = LoggerFactory.getLogger(MyServletListener.class);

    @Override
    public void requestInitialized(ServletRequestEvent servletRequestEvent) {
        logger.info("ServletRequest init!");
    }

    @Override
    public void requestDestroyed(ServletRequestEvent servletRequestEvent) {
        logger.info("ServletRequest destroyed!");
    }
}
