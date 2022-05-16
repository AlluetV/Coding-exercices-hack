package com.alluet.hackerrank.algorithms.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class SubarrayDivision {

    public static int birthday(List<Integer> s, int d, int m) {
        // Write your code here
        int posibilities = 0;
        int result = 0;


        for (int i = 0; i < m; i++) {
            result += s.get(i);
        }

        for (int i = 0; i < s.size() - m+1; i++) {

            if(result == d){
              posibilities ++;
            }
            if(i + m < s.size()){
                result = result - s.get(i) + s.get(i+m);
            }
        }

        return posibilities;
    }

    @Test
    public void birthdayTest(){
       int bTest = birthday(List.of(1, 1, 1, 1, 1, 1), 3, 2);
        Assertions.assertEquals(0,bTest);
    }

    @Test
    public void birthdayTest2(){
        int bTest2 = birthday(List.of(4), 4, 1);
        Assertions.assertEquals(1,bTest2);
    }

    @Test
    public void birthdayTest3(){
        int bTest3 = birthday(List.of(1, 2, 1, 3, 2), 3, 2);
        Assertions.assertEquals(2,bTest3);
    }

    @Test
    public void birthdayTest4(){
        int bTest4 = birthday(List.of(2, 2, 1, 3, 2), 4, 2);
        Assertions.assertEquals(2,bTest4);
    }

}
