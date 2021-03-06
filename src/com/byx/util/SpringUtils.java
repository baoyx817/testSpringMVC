package com.byx.util;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class SpringUtils implements ApplicationContextAware {
    private static ApplicationContext applicationContext;
    @Override
    public void setApplicationContext(ApplicationContext arg0)
        throws BeansException {
        SpringUtils.applicationContext = arg0;
    }
    public static Object getBean(String name){
    	return applicationContext.getBean(name);
    }
}
