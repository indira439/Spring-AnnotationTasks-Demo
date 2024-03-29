package com.stackroute.domain;

import org.springframework.beans.factory.annotation.Autowired;

public class Movie {

    public Actor actor;

    @Autowired
    public void setActor(Actor actor) {
        this.actor = actor;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "actor=" + actor +
                '}';
    }
}
