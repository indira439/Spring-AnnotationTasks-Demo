package com.stackroute;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Main {
    public static void main(String[] args) {

        AbstractApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        /**Close the applicationContext*/
        applicationContext.registerShutdownHook();
    }
}
