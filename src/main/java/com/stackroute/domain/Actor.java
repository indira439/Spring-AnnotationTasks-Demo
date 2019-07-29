package com.stackroute.domain;

import org.springframework.beans.factory.annotation.Value;

public class Actor {

    @Value("23")
    private int age;
    @Value("Indu")
    private String name;
    @Value("Female")
    private String gender;


//    public int getAge() {
//        return age;
//    }
//
//    public String getGender() {
//        return gender;
//    }
//
//    public void setGender(String gender) {
//        this.gender = gender;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }

    @Override
    public String toString() {
        return "Actor{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
