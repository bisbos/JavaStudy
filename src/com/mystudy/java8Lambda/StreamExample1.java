package com.mystudy.java8Lambda;

import java.util.Arrays;
import java.util.List;

/**
 * Created by bbose on 4/14/17.
 */
public class StreamExample1 {

    public static void main(String[] args){

        List<Person> persons = Arrays.asList(
                new Person("Bisin","Bose",28),
                new Person("Anil","Kumar",30),
                new Person("Sunil","Amar",25),
                new Person("Bob","John",32)
        );


        persons.stream().forEach(System.out::println);

        System.out.println("Printing Using Filter");
        persons.stream().
                filter(p -> p.getFirstname().startsWith("B")).
                forEach(System.out::println);

    }
}
