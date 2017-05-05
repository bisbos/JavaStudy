package com.mystudy.java8coding;

import org.junit.Test;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Created by bbose on 5/3/17.
 */

//Six least significant digits F(36)= 14930352 (But it should return 930352)
public class Fibanocci {

    private static Map<Integer,Integer> fibMap = new HashMap<>();

    static {
        fibMap.put(0,0);
        fibMap.put(1,1);
    }

    public int solution(int N){
        return fibMap.computeIfAbsent(N,y-> {
            int fibanocci = solution(y-1)+solution(y-2);
            if (String.valueOf(fibanocci).length()>6){
                return  Integer.valueOf(
                String.valueOf(fibanocci).substring(String.valueOf(fibanocci).length()-6,String.valueOf(fibanocci).length()));
            }else{
                return fibanocci;
            }

        });

    }

    @Test
    public void testFibanocci(){
        System.out.println(solution(36));
    }
}
