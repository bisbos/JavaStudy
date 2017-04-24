package com.mystudy.codingtest;

import org.junit.Test;

/**
 * Created by Sreesha on 4/23/2017.
 */
/**
 * pow(2,0) = 1
 * pow(2,1) = 2  2*1
 * pow(2,2) = 4  2*2
 * pow(2,3) = 8	 2*2*2
 * pow(2,4) = 16  2*2*2*2
 * @author Sreesha
 *
 */
public class PowerOfTwo {

    public Integer getPower(Integer number){
        Integer power = 1;
        if(number==0)
            return 1;
        else
            for(int i=0;i<number;i++){
                power =power*2;
            }
        return power;
    }

    public Integer getPowerRecusrion(Integer number){
        if (number==0)
            return 1;
        return getPowerRecusrion(number-1)*2;
    }

    @Test
    public void testPower(){
        System.out.println(getPower(4));
    }

    @Test
    public void testPowerRecusrion(){
        System.out.println(getPowerRecusrion(4));
    }
}
