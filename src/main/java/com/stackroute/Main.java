package com.stackroute;

import com.stackroute.domain.Movie;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

public class Main
{
    public static void main( String[] args )
    {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        Movie movie = applicationContext.getBean("movie",Movie.class);
        System.out.println(movie);

    }
}
