package com.mystudy.java8LambdaStudy;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Sreesha on 4/29/2017.
 */
public class ReduceExample {

    public static void main(String[] args){
        List<Person> personList = Arrays.asList(
                new Person("Bisin",20),
                new Person("Anil",25),
                new Person("Sunil",28),
                new Person("Ajit",21),
                new Person("Sandeep",24)
        );

        findSumofPersons(personList);

        findSumofPersonsFlow(personList);


    }

    public static void findSumofPersonsFlow(List<Person> personList){
        System.out.println("-----------------------------------");
        Integer sumOfAge = personList.stream()
                .map(p->p.getAge())
                .reduce(0,(sum,p) -> {
                    System.out.format("accumulator: sum=%s; person=%s\n", sum, p);
                    return sum +=p;
                });
        System.out.println(sumOfAge);
        System.out.println("-----------------------------------");

        Integer sumOfAge1 = personList.stream()
                .reduce(0,(sum,p)-> {
                            System.out.format("accumulator: sum=%s; person=%s\n", sum, p);
                            return sum+p.getAge();
                        },
                        (sum1,sum2)-> {
                                System.out.format("combiner: sum1=%s; sum2=%s\n", sum1, sum2);
                                return sum1+sum2;
                        }
                );
        System.out.println(sumOfAge1);
        System.out.println("-----------------------------------");

        Integer sumOfAge2 = personList.parallelStream()
                .reduce(0,(sum,p)-> {
                            System.out.format("accumulator: sum=%s; person=%s\n", sum, p);
                            return sum+p.getAge();
                        },
                        (sum1,sum2)-> {
                            System.out.format("combiner: sum1=%s; sum2=%s\n", sum1, sum2);
                            return sum1+sum2;
                        }
                );
        System.out.println(sumOfAge2);
        System.out.println("-----------------------------------");

    }

    public static void findSumofPersons(List<Person> personList){
        Integer sumOfAge = personList.stream()
                .map(p->p.getAge())
                .reduce(0,(sum,p) -> sum + p);
        System.out.println(sumOfAge);

        Integer sumOfAge1 = personList.stream()
                .reduce(0,(sum,p)->sum+p.getAge(),(sum1,sum2)->sum1+sum2);
        System.out.println(sumOfAge1);

    }
}
