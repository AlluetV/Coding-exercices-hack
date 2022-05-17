package com.alluet.hackerrank.algorithms.easy2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PickingNumbersSolution2 {

    public static int pickingNumbers(List<Integer> a) {
        // Write your code here

        int frequency[] = new int[101];
        int result = Integer.MIN_VALUE;

        for (int i = 0; i < a.size(); i++) {
            int index=a.get(i);
            frequency[index]++; //frequency[index]=frequency[index]+1
        }

        for (int i = 1; i <= 100; i++) {
            result = Math.max(result, frequency[i] + frequency[i - 1]);
        }
        return result;

    }


    @Test
    public void inputTest(){
        List<Integer> test1 = new ArrayList<>();
        Collections.addAll(test1, 1,1,2,2,4,4,5,5,5);

        int result = pickingNumbers(test1);
        Assertions.assertEquals(5, result);
    }

    @Test
    public void inputTest2(){
        List<Integer> test2 = new ArrayList<>();
        Collections.addAll(test2, 4, 6, 5, 3, 3, 1);

        int result2 = pickingNumbers(test2);
        Assertions.assertEquals(3, result2);
    }

    @Test
    public void inputTest3(){
        List<Integer> test3 = new ArrayList<>();
        Collections.addAll(test3, 1, 2, 2, 3, 1, 2);

        int result3 = pickingNumbers(test3);
        Assertions.assertEquals(5, result3);
    }

    @Test
    public void inputTest4(){
        List<Integer> test4 = new ArrayList<>();
        Collections.addAll(test4, 1, 3, 5, 7, 9, 12);

        int result4 = pickingNumbers(test4);
        Assertions.assertEquals(0, result4);
    }
}

