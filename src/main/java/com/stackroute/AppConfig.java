package com.stackroute;

import com.stackroute.demo.BeanLifecycleDemoBean;
import com.stackroute.demo.BeanPostProcessorDemoBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean(name = {"beanLifeCycle"})
    public BeanLifecycleDemoBean getBeanLifeCycle() {
        return new BeanLifecycleDemoBean();
    }

    @Bean(name = {"beanPostProcessor"})
    public BeanPostProcessorDemoBean getBeanPostProcessor() {
        return new BeanPostProcessorDemoBean();
    }
}
