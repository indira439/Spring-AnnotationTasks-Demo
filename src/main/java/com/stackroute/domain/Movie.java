package com.stackroute.domain;

import java.util.List;

public class Movie {

    public List<Actor> actor;

    public Movie(List<Actor> actor) {
        this.actor = actor;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "actor=" + actor +
                '}';
    }
}
