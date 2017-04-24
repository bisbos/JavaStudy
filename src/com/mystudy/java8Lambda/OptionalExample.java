package com.mystudy.java8Lambda;

import java.util.Optional;

/**
 * Created by Sreesha on 4/21/2017.
 */
public class OptionalExample {

    public static void main(String[] args){
        Optional<String> gender = Optional.of("Male");
        //get
        System.out.println(gender.get());

        gender.ifPresent(System.out::println);
    }
}


