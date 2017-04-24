package com.mystudy.java8StringOperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Sreesha on 4/21/2017.
 */
public class Example1 {

    public static void main(String[] args){
            //java, python, nodejs, ruby
        List<String> list = Arrays.asList("java", "python", "nodejs", "ruby");
        String result = String.join(", ", list);
        System.out.println(result);

        //Collectors Joining example
        String result1 = list.stream().map(x->x).collect(Collectors.joining("| "));
        System.out.println(result1);

        //remove Bisin from String Array
        List<String> nameList = Arrays.asList("Anil","Sunil","Bisin");
        List<String> removaedNameList = nameList.stream().filter(x->!x.equals("Bisin")).collect(Collectors.toList());
        System.out.println(removaedNameList.toString());

        //Find the person with name Bisin
        List<Person> personList = Arrays.asList(new Person("Bisin","Bose",23),
                                                new Person("Sunil","Kumar",32),
                                                new Person("Amir","Khan",20));
        String name = personList.stream().filter(x->x.getFirstname().equals("Jijo")).
                map(Person::getFirstname).
                findAny().
                orElse("Does not exist");
        System.out.println(name);

    }
}
