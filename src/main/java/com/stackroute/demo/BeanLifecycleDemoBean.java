package com.stackroute.demo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class BeanLifecycleDemoBean implements InitializingBean, DisposableBean {


    @Override
    public void destroy() throws Exception {
        System.out.println("The destroy() is called by Spring to perform clean up operations.");

    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("The afterPropertiesSet() is called by Spring to perform initialization ");

    }

    @PostConstruct
    public void customInit() {
        System.out.println("Method customInit invoked..");
    }

    @PreDestroy
    public void customDestroy() {
        System.out.println("Method customDestroy invoked..");
    }
}
