package com.mystudy.java8Lambda;

import java.util.Arrays;
import java.util.List;

/**
 * Created by bbose on 4/14/17.
 */
public class ForEachExample {

    public static void main(String[] args){

        List<Person> persons = Arrays.asList(
                new Person("Bisin","Bose",28),
                new Person("Anil","Kumar",30),
                new Person("Sunil","Amar",25)
        );


      persons.forEach(System.out::println);

    }
}
