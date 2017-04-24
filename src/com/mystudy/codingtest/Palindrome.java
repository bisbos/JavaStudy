package com.mystudy.codingtest;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by Sreesha on 4/22/2017.
 */

public class Palindrome {

    public Boolean isPalindrome(String value){
        value = value.toLowerCase();
        boolean palindrome = true;
        int j = value.length()-1;
        for (int i=0;i<value.length()/2;i++){
            if (value.charAt(i)!=value.charAt(j)) {
                palindrome = false;
                break;
            }else {
                j--;
            }
        }
        return palindrome;
    }

    @Test
    public void testPalindrome(){
        String value = "malayalam";
        assertTrue(isPalindrome(value));
    }

    @Test
    public void testPalindrome1(){
        String value = "Hindi";
        assertFalse(isPalindrome(value));
    }
}
