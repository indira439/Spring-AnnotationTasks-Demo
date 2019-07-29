package com.stackroute;

import com.stackroute.domain.Movie;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main
{
    public static void main( String[] args )
    {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        Movie movie = applicationContext.getBean("movie",Movie.class);
        System.out.println(movie);

        /**Returns false if scope of Movie bean is changed to prototype*/
        Movie movieDup = applicationContext.getBean("movie",Movie.class);
        System.out.println(movie == movieDup);


        /**Changed the bean name of movie to "movieA","movieB" and trying to get movie bean using 2 names*/
        Movie movieA = applicationContext.getBean("movieA",Movie.class);
        System.out.println(movieA);

        Movie movieB = applicationContext.getBean("movieB",Movie.class);
        System.out.println(movieB);


    }
}
