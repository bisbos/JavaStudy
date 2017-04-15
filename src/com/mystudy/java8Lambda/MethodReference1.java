package com.mystudy.java8Lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 * Created by bbose on 4/13/17.
 */
public class MethodReference1 {

    public static void main(String[] args){

        List<Person> persons = Arrays.asList(
                new Person("Bisin","Bose",28),
                new Person("Anil","Kumar",30),
                new Person("Sunil","Amar",25)
        );


        //Create a method that prints all the name
        // printAll(persons);
        performPrinting(persons,p->true,System.out::println);

        //Create a method that prints name beginning with B
        //  printNamewithB(persons,p -> p.getLastname().startsWith("A"));
        performPrinting(persons, p -> p.getLastname().startsWith("B"),System.out::println);  //p -> method(p)

    }

    //Predicate has a method test which returns a Boolean
    public static void performPrinting(List<Person> persons, Predicate<Person> predicate, Consumer<Person> consumer){
        for(Person person:persons){
            if (predicate.test(person)){
                consumer.accept(person);
            }
        }

    }
}
