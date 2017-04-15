package com.mystudy.patterns;

/**
 * Created by bbose on 4/12/17.
 */
public class SingletonDemo {

    private static SingletonDemo obj;

    private SingletonDemo(){

        //To prevent Reflection
        if (obj != null) {
            throw new IllegalStateException("Singleton already constructed");
        }
    }
    public static SingletonDemo getInstance(){
        if(obj==null){
            //To prevent multithreading initialize in Synchronized class and double check instance is null
            synchronized (SingletonDemo.class){
                if(obj==null){
                    obj = new SingletonDemo();
                }
            }

        }
        return obj;
    }

    //Override clone() method to prevent Cloning
    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("Cloning of this class is not allowed");
    }

    //Override readReslove() method to prevent Serialization
    protected Object readResolve() {
        return obj;
    }
}
