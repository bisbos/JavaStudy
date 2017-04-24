package com.mystudy.datastructurecoding;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Sreesha on 4/23/2017.
 */
public class BinarySearch {

    public Boolean findElement(Integer[] numberArray,Integer searchElement){
        Integer start =0;
        Integer end = numberArray.length-1;
        Integer mid = (start + end)/2;
        while (start<end){
            if (numberArray[mid]==searchElement){
                return true;
            }else if (numberArray[mid]<searchElement){
                start = mid+1;
            }else{
                end=mid-1;
            }
            mid =(start+end)/2;
        }
        return false;
    }

    @Test
    public void searchElement(){
        Integer[] numberArray = {3,6,9,14,17,19,26,32,45};
        Integer searchElement =26;
        Assert.assertTrue(findElement(numberArray,searchElement));
    }

    @Test
    public void searchElement1(){
        Integer[] numberArray = {3,6,9,14,17,19,26,32,45};
        Integer searchElement =25;
        Assert.assertFalse(findElement(numberArray,searchElement));
    }
}
