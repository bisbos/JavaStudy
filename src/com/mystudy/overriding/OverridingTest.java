package com.mystudy.overriding;

import java.io.IOException;

/**
 * Created by bbose on 4/12/17.
 */
public class OverridingTest {

    public static void main(String[] args) throws Exception{
        Vehicle vehicle = new Car();
        //Parent class variable will call the overriden method in child class
        vehicle.display();
        vehicle.getPrice();

            //Parent class instance cannot call the child class methods
      //  vehicle.getColour();

        Vehicle.showPrice();


    }
}

class Vehicle{

    public void display() throws Exception{
        System.out.println("I am in Vehicle");
    }

    public void getPrice(){
        System.out.println("My Price is 1000 Dollars");
    }

    public static void showPrice(){
        System.out.println("Vehicle show price is 1000 Dollars");
    }
}

class Car extends Vehicle{
    public void display() throws Exception{
        System.out.println("I am in Car");
    }

    public void getColour(){
        System.out.println("My Colour is Black");
    }

    public static void showPrice(){
        System.out.println("Car show price is 2000 Dollars");
    }
}
