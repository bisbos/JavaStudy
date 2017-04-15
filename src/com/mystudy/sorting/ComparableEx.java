package com.mystudy.sorting;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by bbose on 4/12/17.
 */
public class ComparableEx {

    public static void main(String[] args){
        List<Person> persons = Arrays.asList(
                new Person(10),
                new Person(5),
                new Person(8),
                new Person(12)
        );
        Collections.sort(persons);

        for(Person person:persons){
            System.out.println(person.getId());
        }
    }
}
