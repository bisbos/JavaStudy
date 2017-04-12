package com.mystudy.java8Lambda;

/**
 * Created by Sreesha on 4/11/2017.
 */
public class LambdaExample1 {

    public static void main(String[] args){
        Greeting g1 = new HelloGreeting();
        g1.greet();

        Greeting g2 = () -> System.out.println("My Lambda Hello World");

        Greeting g3 = new Greeting() {
            @Override
            public void greet() {
                System.out.println("My Inner Class Hello World");
            }
        };
        g3.greet();

        //When there is only one argument no need for paranthesis for the input variable
        //When there is only one statement no need for curly bracket and return statement
        //Compiler will identify the Type of the variable/Return type in the method defined in the interface
        MyCalculate myCalculate = a -> a * 2;
        System.out.println(myCalculate.calculate(10));
        MyCalculate1 myCalculate1 = (a,b) -> {
            if (a==0){
             return 0;
            }
            else
                return a + b;
        };
        System.out.println(myCalculate1.addNumbers(0,5));
        System.out.println(myCalculate1.addNumbers(10,5));
    }
}

interface Greeting{
    public void greet();
}

class HelloGreeting implements Greeting{

    public void greet(){
        System.out.println("My Object HelloWorld");
    }
}

interface MyCalculate{
    public Integer calculate(Integer a);
}

interface MyCalculate1{
    public Integer addNumbers(Integer a,Integer b);
}

