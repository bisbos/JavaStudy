package com.mystudy.java8Lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 * Created by bbose on 4/13/17.
 */
public class LambdaListJava8Consumer {

    public static void main(String[] args){

        List<Person> persons = Arrays.asList(
                new Person("Bisin","Bose",28),
                new Person("Anil","Kumar",30),
                new Person("Sunil","Amar",25)
        );

        //Sort list by last name
   /*     Collections.sort(persons, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getLastname().compareTo(o2.getLastname());
            }
        }); */

        Collections.sort(persons,(o1, o2) -> o1.getLastname().compareTo(o2.getLastname()));

        //Create a method that prints all the name
        // printAll(persons);
        performPrinting(persons,p->true,p -> System.out.println(p));

        //Create a method that prints name beginning with B
        //  printNamewithB(persons,p -> p.getLastname().startsWith("A"));
        performPrinting(persons, p -> p.getLastname().startsWith("B"),p -> System.out.println(p));

    }

    public static void printAll(List<Person> persons){
        for (Person person:persons)
            System.out.println(person.getFirstname()+" "+person.getLastname()+" "+person.getAge());
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
