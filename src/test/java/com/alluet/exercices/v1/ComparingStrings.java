package com.alluet.exercices.v1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

public class ComparingStrings {

    public static boolean compareStrings (String strOne, String strTwo){

        Map< Character , Integer> stringChars = new HashMap<>();

        Map< Character ,Integer> strChars = new HashMap<>();

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
            int count =0;

            if(!strChars.containsKey(strTwo.charAt(i))){
                count = 1;
                strChars.put(strTwo.charAt(i) , count);
            }else {
                int increment = 1 + strChars.get(strTwo.charAt(i));
                strChars.put(strTwo.charAt(i), increment );
            }
        }

        return  stringChars.entrySet().equals(strChars.entrySet());
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
}
