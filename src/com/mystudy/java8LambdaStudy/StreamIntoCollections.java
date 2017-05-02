package com.mystudy.java8LambdaStudy;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by Sreesha on 4/29/2017.
 */
public class StreamIntoCollections {

    public static void main(String[] args) {
        List<Person> personList = Arrays.asList(
                new Person("Bisin", 20),
                new Person("Anil", 25),
                new Person("Sunil", 28),
                new Person("Ajit", 20),
                new Person("Sandeep", 28)
        );

       getNamesList(personList);
        getNameMap(personList);
    }

    public static void getNamesList(List<Person> personList){
        List<Person> namesList = personList.stream()
                .filter(p->p.getName().startsWith("A"))
                .collect(Collectors.toList());

        System.out.println("-------------List Example-----------------");
        namesList.stream().forEach(p->System.out.println(p.getName()));

        List<String> namesWithA = personList.stream()
                .filter(p->p.getName().startsWith("A"))
                .map(Person::getName)
                .collect(Collectors.toList());
        System.out.println(namesWithA);
        System.out.println("-------------------------------------------");
    }

    public static void getNameMap(List<Person> personList){
        System.out.println("-------------Map Example-----------------");
        Map<String,Integer> nameMap = personList.stream().
                collect(Collectors.toMap(Person::getName,Person::getAge));
        System.out.println(nameMap);
      Map<Integer,String> ageMap= personList.stream()
              .collect(Collectors.toMap(Person::getAge,Person::getName,(name1,name2)->name1+","+name2));
        System.out.println(ageMap);
        System.out.println("-------------------------------------------");
    }
}
