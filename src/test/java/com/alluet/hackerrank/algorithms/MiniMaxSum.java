package com.alluet.hackerrank.algorithms;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.*;

public class MiniMaxSum {

    public static List<Long> miniMaxSum(List<Integer> arr) {
        // Write your code here
        long max = 0;
        long min = 0;
        long sum = 0;
        long partialSum = 0;

        List<Long> sums = new ArrayList<>();

        for (int i = 0; i < arr.size(); i++) {
            partialSum += arr.get(i);
        }

        for (int i = 0; i < 5; i++) {
            sum = partialSum - arr.get(i);
            sums.add(sum);
        }
        System.out.println(sums);



        for (int i = 0; i < sums.size(); i++) {
            Collections.sort(sums);
            long a = sums.get(0);

            min = Math.min(a,sums.get(i));
            max = Math.max(a,sums.get(i));

        }

        List<Long> minMax = new ArrayList<Long>();
        minMax.add(min);
        minMax.add(max);

        return minMax;
    }

    @Test
    public void sumResult1(){
        List<Long> sums1 = miniMaxSum(Arrays.asList(1,3,5,7,9));
        Assertions.assertEquals(Arrays.asList(16L, 24L), sums1);
    }

    @Test
    public void sumResult2(){
        List<Long> sums2 = miniMaxSum(Arrays.asList(1,2,3,4,5));
        Assertions.assertEquals(Arrays.asList(10L, 14L), sums2);
    }

    @Test
    public void sumResult3(){
        List<Long> sums3 = miniMaxSum(Arrays.asList( 7, 69, 2, 221, 8974));
        Assertions.assertEquals(Arrays.asList(299L, 9271L), sums3);
    }
    @Test
    public void sumResult4(){
        List<Long> sums4 = miniMaxSum(Arrays.asList(396285104, 573261094, 759641832, 819230764, 364801279));
        Assertions.assertEquals(Arrays.asList(2093989309L, 2548418794L), sums4);
    }
}


