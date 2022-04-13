package com.alluet.exercices.v1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

public class CompareStringsV2 {

    public static boolean compareStrings (String strOne, String strTwo){

        Map< Character , Integer> stringChars = new HashMap<>();

        for (int i = 0; i < strOne.length(); i++) {
            int count =0;

            if(!stringChars.containsKey(strOne.charAt(i))){
                count = 1;
                stringChars.put(strOne.charAt(i) , count);
            }else {
                int increment = 1 + stringChars.get(strOne.charAt(i));
                stringChars.put(strOne.charAt(i), increment );
            }
        }
        System.out.println(stringChars);

         for (int i = 0; i < strTwo.length(); i++) {
            char v = strTwo.charAt(i);
            System.out.println(v);

            if( stringChars.containsKey(v)){

                int decrement = stringChars.get(strTwo.charAt(i)) - 1;
                stringChars.put(strTwo.charAt(i), decrement);

                if(stringChars.get(strTwo.charAt(i)) == 0){
                    stringChars.remove(strTwo.charAt(i));
                }

            }else {
                return false;
            }

        }

        return stringChars.isEmpty();
    }

    @Test
    public  void testComparison(){
        boolean result = compareStrings("bba", "abb");
        Assertions.assertTrue(result);
    }

    @Test
    public  void testComparison2(){
        boolean result2 = compareStrings("abcdefg", "abcdefs");
        Assertions.assertFalse(result2);
    }

    @Test
    public void testComparison3(){
        Assertions.assertFalse(compareStrings("aab", "abb"));
    }

    @Test
    public void testComparison4(){
        Assertions.assertFalse(compareStrings("aab", "abba"));
    }

}
