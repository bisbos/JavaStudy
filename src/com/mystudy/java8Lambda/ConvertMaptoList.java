package com.mystudy.java8Lambda;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by Sreesha on 4/22/2017.
 */
public class ConvertMaptoList {

    public static void main(String[] args){

        Map<Integer, String> map = new HashMap<>();
        map.put(10, "apple");
        map.put(20, "orange");
        map.put(30, "banana");
        map.put(40, "watermelon");
        map.put(50, "dragonfruit");

        List<String> fruitList = map.entrySet().stream().map(e->e.getValue()).collect(Collectors.toList());
        System.out.println(fruitList.toString());
    }
}
