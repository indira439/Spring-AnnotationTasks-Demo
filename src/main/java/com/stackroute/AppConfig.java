package com.stackroute;

import com.stackroute.demo.BeanLifecycleDemoBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan("com.stackroute.domain")
public class AppConfig {

    @Bean(name = {"beanLifeCycle"})
    public BeanLifecycleDemoBean getBeanLifeCycle() {
        return new BeanLifecycleDemoBean();
    }
}
