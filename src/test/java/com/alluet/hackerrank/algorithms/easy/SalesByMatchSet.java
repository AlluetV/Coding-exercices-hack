package com.alluet.hackerrank.algorithms.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.*;

public class SalesByMatchSet {

    public static int sockMerchant(int n, List<Integer> ar) {
        // Write your code here

        int numPairs =0;

        Set<Integer> socks = new HashSet<>();

        for (Integer i : ar) {
            if(!socks.add(i)){
                numPairs++;
                socks.remove(i);
            }
        }
        return numPairs;
    }

    @Test
    public void testInput(){
        int pairs = sockMerchant(7, List.of(1,2,1,2,1,3,2));
        Assertions.assertEquals(2, pairs);
    }

    @Test
    public void testInput2(){
        int pairs2 = sockMerchant(9, List.of(10, 20, 20, 10, 10, 30, 50, 10, 20));
        Assertions.assertEquals(3, pairs2);
    }

    @Test
    public void testNoInput(){
        int noPairs = sockMerchant(9, List.of(1,2,3,4));
        Assertions.assertEquals(0, noPairs);
    }

    @Test
    public void testInput3(){
        int pairs3 = sockMerchant(5, List.of(1,1,1,1,1));
        Assertions.assertEquals(2, pairs3);
    }
}
