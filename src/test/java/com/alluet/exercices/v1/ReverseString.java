package com.alluet.exercices.v1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ReverseString {

   public static String reverse(String  str){

        StringBuilder reverseStr = new StringBuilder(str);
        return reverseStr.reverse().toString();

       /*
       StringBuilder reverseStr = new StringBuilder();

       for (int i = str.length()-1; i >= 0; i--) {
           reverseStr.append(str.charAt(i));
        }

        return reverseStr.toString();
        */
    }

    @Test
    public void inputTest(){
        String testStr = reverse("hello");
        Assertions.assertEquals("olleh",testStr);
    }
}
