package com.mystudy.java8Lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

/**
 * Created by Sreesha on 4/11/2017.
 */
public class LambdaListExample {

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

        Collections.sort(persons,(o1,o2) -> o1.getLastname().compareTo(o2.getLastname()));

        //Create a method that prints all the name
        printAll(persons);

        //Create a method that prints name beginning with B
      //  printNamewithB(persons,p -> p.getLastname().startsWith("A"));
        printNamewithB(persons);

    }

    public static void printAll(List<Person> persons){
        for (Person person:persons)
            System.out.println(person.getFirstname()+" "+person.getLastname()+" "+person.getAge());
    }

    public static void printNamewithB(List<Person> persons){
        for(Person person:persons){
            if (person.getLastname().startsWith("B")){
                System.out.println(person.getFirstname()+" "+person.getLastname()+" "+person.getAge());
            }
        }

    }



}

class Person {

    private String firstname;
    private String lastname;
    private Integer age;

    public Person(String firstname, String lastname, Integer age) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
    }

    public Integer getAge() {

        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getLastname() {

        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {

        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    @Override
    public String toString(){
        return this.getFirstname()+" "+this.getLastname()+" "+this.getAge();
    }
}
