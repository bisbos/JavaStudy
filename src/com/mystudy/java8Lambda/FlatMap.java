package com.mystudy.java8Lambda;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by Sreesha on 4/22/2017.
 */
public class FlatMap {

    public static void main(String[] args){

        Person person1 = new Person("Bisin","Bose",28);
        Person person2 = new Person("Anil","Kumar",30);
        Person person3 = new Person("Sunil","Amar",25);
        List<Person> personList = new ArrayList<>();
        personList.add(person1);
        personList.add(person2);
        personList.add(person3);

        List<String> firstName = personList.stream().map(e -> e.getFirstname()).collect(Collectors.toList());
        System.out.println(firstName.toString());

        Student student1 = new Student();
        student1.setName("Bisin");
        student1.addBook("Daffodils");

        Student student2 = new Student();
        student2.setName("Anil");
        student2.addBook("Jingle Book");

        List<Student> studentList = new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);

       List<String> bookName = studentList.stream().map(e -> e.getBook().toString()).collect(Collectors.toList());
        System.out.println(bookName);

        List<String> bookName1 = studentList.stream().map(e->e.getBook()).flatMap(e ->e.stream()).collect(Collectors.toList());
        System.out.println(bookName1.toString());


      /* List<String> firstName = persons.stream().map(e -> e.getFirstname().toLowerCase()).collect(Collectors.toList());
        System.out.println(firstName.toString());

        String[][] data = new String[][]{{"a", "b"}, {"c", "d"}, {"e", "f"}};
        //Stream<String[]>
        Stream<String[]> temp = Arrays.stream(data);
        //filter a stream of string[], and return a string[]?
        Stream<String> stringStream = temp.flatMap(x -> Arrays.stream(x));
        Stream<String> stream = stringStream.filter(x -> "a".equals(x.toString()));
        stream.forEach(System.out::println); */
    }
}

class Student{
    private String name;
    Set<String> book;
    public void addBook(String bookName){
        if (null==book)
            book = new HashSet<>();
        this.book.add(bookName);
    }

    public String getName() {
        return name;
    }

    public Set<String> getBook() {
        return book;
    }

    public void setBook(Set<String> book) {
        this.book = book;
    }

    public void setName(String name) {
        this.name = name;
    }
}