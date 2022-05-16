package com.alluet.hackerrank.algorithms.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class VeryBigSum {
    public static long aVeryBigSum(List<Long> ar) {
        // Write your code here
        long sum = 0;
        for (int i = 0; i < ar.size(); i++) {
           sum += ar.get(i);
        }
        return sum;
    }

    @Test
    public void input1(){
        long result = aVeryBigSum( List.of( 1000000001L, 1000000002L, 1000000003L, 1000000004L, 1000000005L ));
        Assertions.assertEquals(5000000015L , result);
    }
}
