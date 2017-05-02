package com.mystudy.java8LambdaStudy;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Sreesha on 4/29/2017.
 */
public class StreamExample {

    public static void main(String[] args){
        List<Person> personList = Arrays.asList(
                new Person("Bisin",20),
                new Person("Anil",25),
                new Person("Sunil",28),
                new Person("Ajit",21),
                new Person("Sandeep",24)
        );

        System.out.println("Displays Name of Person in the List");
        displayList(personList);

        System.out.println("Displays Name of Person with Name starts with A");
        filterwithName(personList);
    }

    public static void displayList(List<Person> personList){
        System.out.println("-----------------------------------");
        personList.stream().
                forEach(p-> System.out.println(p.getName()));
        System.out.println("-----------------------------------");
    }

    public static void filterwithName(List<Person> personList){
        personList.stream().
                filter(p->p.getName().startsWith("A")).
                forEach(p-> System.out.println(p.getName()));
        System.out.println("-----------------------------------");
    }
}
