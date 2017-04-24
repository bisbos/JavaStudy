package com.mystudy.java8StringOperations;

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
