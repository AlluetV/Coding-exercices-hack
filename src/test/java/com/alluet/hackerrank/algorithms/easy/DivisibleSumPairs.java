package com.alluet.hackerrank.algorithms.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class DivisibleSumPairs {

    public static int divisibleSumPairs(int n, int k, List<Integer> ar) {
        // Write your code here
        int pairs = 0;
        for (int i = 0; i < ar.size() ; i++) {
            for (int j = 0; j < ar.size(); j++) {
                if(i<j){
                    int pair = ar.get(i) + ar.get(j);
                    if(pair % k == 0){
                        pairs++;
                    }
                }
            }
        }
        return pairs;
    }

    @Test
    public void testInput(){
        int testPairs = divisibleSumPairs(6, 5, List.of(1,2,3,4,5,6));
        Assertions.assertEquals(3, testPairs);
    }

    @Test
    public void testInput2(){
        int testPairs2 = divisibleSumPairs(6, 3, List.of(1,3,2,6,1,2));
        Assertions.assertEquals(5, testPairs2);
    }
}
