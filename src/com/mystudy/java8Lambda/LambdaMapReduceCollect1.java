package com.mystudy.java8Lambda;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by bbose on 4/18/17.
 */
public class LambdaMapReduceCollect1 {

    public static void main(String[] args){

        List<Person> persons = Arrays.asList(
                new Person("Bisin","Bose",28),
                new Person("Anil","Kumar",30),
                new Person("Sunil","Amar",25)
        );

       Map<String,Person>  personMap = persons.stream().collect(Collectors.toMap(person -> person.getFirstname(), person -> person));
        System.out.println(personMap);
    }


}
