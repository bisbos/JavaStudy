package com.mystudy.codingtest;

import org.junit.Test;

/**
 * Created by Sreesha on 4/23/2017.
 *
 * 6! = 6*5*4*3*2*1
 * 0!=1
 */
public class FactorialRecursion {

    public Integer factorial(Integer number){
        if(number==0)
            return 1;
        else
            return number*factorial(number-1);
    }

    @Test
    public void testFactorial(){
        System.out.println("Factorial of 6 is :"+factorial(6));
        System.out.println("Factorial of 3 is :"+factorial(3));
        System.out.println("Factorial of 1 is :"+factorial(1));
        System.out.println("Factorial of 0 is :"+factorial(0));
    }
}
