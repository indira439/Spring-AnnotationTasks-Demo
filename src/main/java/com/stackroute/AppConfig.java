package com.stackroute;

import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class AppConfig {

    @Bean
    public Actor getActor1() {
        Actor actor = new Actor(20, "anu", "Female");
        return actor;
    }

    @Bean
    public Actor getActor2() {
        Actor actor = new Actor(30, "shiv", "Male");
        return actor;
    }

    @Bean(name = {"movie","movieA" ,"movieB"})
    @Scope("prototype")
    public Movie getMovie() {
        List<Actor> actorList = new ArrayList<>();
        actorList.add(getActor1());
        actorList.add(getActor2());
        Movie movie = new Movie(actorList);
        return movie;
    }
}
