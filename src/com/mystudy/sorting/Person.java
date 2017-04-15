package com.mystudy.sorting;

/**
 * Created by bbose on 4/12/17.
 */
public class Person implements Comparable {

    private Integer id;
    Person(Integer id){
        this.id=id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public int compareTo(Object o) {
        //By Default String implements Comparable.So we can use comapreTo
        Person p = (Person) o;
        return id-p.id;
    }
}
