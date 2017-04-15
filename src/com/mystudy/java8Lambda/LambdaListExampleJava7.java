package com.mystudy.java8Lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by bbose on 4/13/17.
 */
public class LambdaListExampleJava7 {

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
      //  printAll(persons);
        conditionalPrinting(persons,p->true);

        //Create a method that prints name beginning with B

      /*  conditionalPrinting(persons, new Condition() {
            @Override
            public Boolean test(Person person) {
                return person.getFirstname().startsWith("B");
            }
        }); */

        conditionalPrinting(persons, p -> p.getLastname().startsWith("B"));

    }

    public static void printAll(List<Person> persons){
        for (Person person:persons)
            System.out.println(person.getFirstname()+" "+person.getLastname()+" "+person.getAge());
    }

    public static void conditionalPrinting(List<Person> persons,Condition condition){
        for(Person person:persons){
            if (condition.test(person)){
                System.out.println(person.getFirstname()+" "+person.getLastname()+" "+person.getAge());
            }
        }

    }
}

interface Condition {
    Boolean test(Person person);
}
