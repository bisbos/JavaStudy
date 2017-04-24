package com.mystudy.codingtest;

import org.junit.Test;

/**
 * Created by Sreesha on 4/23/2017.
 */
public class ReverseSentence {

    public String getReversedString(String sentence){
        String[] splitSentence = sentence.split(" ");
        String reversedSentence = new String();
        for(int i=splitSentence.length-1;i>=0;i--){
           reversedSentence +=splitSentence[i]+ " ";
        }
        return reversedSentence;
    }

    public String getReversedSenetnceRecursion(String sentence){
        Integer index = sentence.indexOf(' ');
        if (index==-1)
            return sentence;
        else
            return getReversedSenetnceRecursion(sentence.substring(index+1))+" "+sentence.substring(0,index);
    }


    @Test
    public void testReverseSenetence(){
        String sentence ="My name is Bisin";
        System.out.println("Normal Reverse :"+getReversedString(sentence));
    }

    @Test
    public void testReverseSentenceRecursion(){
        String sentence ="My name is Bisin";
        System.out.println("Reverse using recursion :"+getReversedSenetnceRecursion(sentence));
    }


}
