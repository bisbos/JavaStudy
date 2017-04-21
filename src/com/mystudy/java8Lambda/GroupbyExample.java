package com.mystudy.java8Lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by bbose on 4/18/17.
 */
public class GroupbyExample {

    public static void main(String[] args){

        List<Person> persons = Arrays.asList(
                new Person("Bisin","Bose",28),
                new Person("Anil","Kumar",30),
                new Person("Sunil","Amar",25),
                new Person("Nivin","Kumar",32),
                new Person("Adi","Amar",28)
        );

        //given a list of people, group them by LastName
        System.out.println(
        persons.stream().collect(Collectors.groupingBy(Person::getLastname)));

        //given a list of people, create a map with LastName as Key and value as the ages with that name
        System.out.println(
                persons.stream().
                        collect(Collectors.groupingBy(Person::getLastname,
                Collectors.mapping(Person::getAge,Collectors.toList()))));
    }
}
