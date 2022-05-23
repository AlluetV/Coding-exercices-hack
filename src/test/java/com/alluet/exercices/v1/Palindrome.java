package com.alluet.exercices.v1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Locale;

public class Palindrome {

    public static boolean isPalindrome(String s){
       String  strLower = s.toLowerCase();
     /*  int i = 0;
       int j = strLower.length()-1;

       while(i<j){

           if (strLower.charAt(i) != strLower.charAt(j)){
               return false;
           }
           i++;
           j--;
       }*/

        for (int k = 0; k < strLower.length()/2; k++) {
            if(strLower.charAt(k) != strLower.charAt(strLower.length()-1-k )){
                return  false;
            }
        }

        return true;
    }

    @Test
    public void input(){
        boolean strTest = isPalindrome("Dot saw I was Tod");
        Assertions.assertEquals(true, strTest);
    }

    @Test
    public void input2(){
        boolean strTest2 = isPalindrome("hello");
        Assertions.assertEquals(false, strTest2);
    }
}
