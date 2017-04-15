package com.mystudy.patterns;

import java.lang.reflect.Constructor;

/**
 * Created by bbose on 4/12/17.
 */
public class ReflectionSingleton {

    public static void main(String[] args){
        SingletonDemo obj1 = SingletonDemo.getInstance();
        SingletonDemo obj2 = null;
        SingletonDemo obj3 = null;

        try{
          /*  Constructor[] constructors = SingletonDemo.class.getConstructors();
            for (Constructor constructor:constructors){
                constructor.setAccessible(true); */
           //     obj2 = (SingletonDemo)constructor.newInstance("My New Object");


            Class<SingletonDemo> classObj = (Class<SingletonDemo>)Class.forName("com.mystudy.patterns.SingletonDemo");
            obj3 = classObj.newInstance();

        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println(obj1.hashCode());
        System.out.println(obj3.hashCode());

    }
}
