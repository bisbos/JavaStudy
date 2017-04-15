package com.mystudy.sorting;

/**
 * Created by bbose on 4/12/17.
 */
public class Employee {

    private Integer id;
    private String name;

    Employee(Integer id,String name){
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
