package com.mystudy.java8LambdaStudy;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Sreesha on 4/29/2017.
 */
public class MapExample {

    public static void main(String[] args){
        List<Person> personList = Arrays.asList(
                new Person("Bisin",20),
                new Person("Anil",25),
                new Person("Sunil",28),
                new Person("Ajit",21),
                new Person("Sandeep",24)
        );
        
        convertToUppercase(personList);
    }

    public static void convertToUppercase(List<Person> personList){
        personList.stream().
                map(p->p.getName().toUpperCase()).
                forEach(p->System.out.println(p));
    }
}
