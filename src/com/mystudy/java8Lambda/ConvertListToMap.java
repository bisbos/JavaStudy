package com.mystudy.java8Lambda;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by Sreesha on 4/21/2017.
 */
public class ConvertListToMap {

    public static void main(String[] args){
        List<Person> persons = Arrays.asList(
                new Person("Bisin","Bose",28),
                new Person("Anil","Kumar",30),
                new Person("Sunil","Amar",25)
        );

       Map<String,String> personMap = persons.stream().collect(Collectors.toMap(Person::getFirstname,Person::getLastname));
        System.out.println(personMap);
    }
}
